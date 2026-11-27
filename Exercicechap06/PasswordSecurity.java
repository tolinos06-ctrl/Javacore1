package javacore.chapter06.workshop.Exercicechap06;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HexFormat;
import at.favre.lib.crypto.bcrypt.BCrypt;


public class PasswordSecurity {
    // techniquement, toute les façons de coder sont réalisables en static(car pas de clé de config, sauf pour Aes(clé  que on peut mettre dans les paramètres))
// Cependant, l'encodage aes peut se faire d'une manière plus simple sans passer par static (permet de n'appeler la clé qu'une seule fois et apres appeler clé.chiffrer.
    private static final int BCRYPT_COST = 10; // Facteur de coût BCrypt (2^10 itérations) : compromis simple pour des tests locaux

    // ==================== BASE 64 (`java.util.Base64` + `String.getBytes()`) ====================

    public static String encodeBase64(String mdp) { // Encode un mot de passe texte en chaîne Base64
        return Base64.getEncoder() // Récupère l'encodeur Base64 standard de Java (`java.util.Base64`)
                .encodeToString(mdp.getBytes()); // Convertit `mdp` en `byte[]` via `.getBytes()` puis renvoie directement une `String` Base64
    } // Fin de encodeBase64

    public static String decodeBase64(String encode) { // Décode une chaîne Base64 pour retrouver le texte d'origine
        return new String( // Crée un nouvel objet `String` à partir des octets décodés (`decode(...)` renvoie un `byte[]`, pas un `String`)
                Base64.getDecoder() // Récupère le décodeur Base64 standard de Java
                        .decode(encode) // Transforme le texte Base64 en tableau d'octets (`byte[]`)
        ); // Fin de `new String(...)`
    } // Fin de decodeBase64

    // ==================== AES (`javax.crypto.Cipher`, `SecretKeySpec`, `Base64`) ====================

    public static String encryptAes(String mdp, String cle) throws Exception { // Chiffre `mdp` avec `cle` ; `throws Exception` évite un `try/catch` lourd ici
        SecretKeySpec secretKey = new SecretKeySpec( // Crée un objet clé AES à partir d'un tableau d'octets
                cle.getBytes(), // Convertit la `String` `cle` en `byte[]`
                "AES" // Précise que cette clé est destinée à l'algorithme AES
        ); // Fin de SecretKeySpec
        Cipher cipher = Cipher.getInstance("AES"); // Demande à `javax.crypto.Cipher` une instance configurée pour l'algorithme AES
        cipher.init(Cipher.ENCRYPT_MODE, secretKey); // Initialise `cipher` en mode chiffrement (`ENCRYPT_MODE`) avec la clé `secretKey`
        byte[] octetsChiffres = cipher.doFinal(mdp.getBytes()); // Convertit `mdp` en `byte[]` avec `.getBytes()` et exécute le chiffrement AES (`byte[]` brut)
        return Base64.getEncoder().encodeToString(octetsChiffres); // Encode les octets chiffrés en Base64 pour obtenir une `String` affichable/stockable
    } // Fin de encryptAes

    public static String decryptAes(String chiffre, String cle) throws Exception { // Déchiffre une chaîne AES encodée en Base64 avec la même `cle`
        SecretKeySpec secretKey = new SecretKeySpec(cle.getBytes(), "AES"); // Reconstruit la clé AES à partir des octets de `cle`
        Cipher cipher = Cipher.getInstance("AES"); // Récupère l'instance `Cipher` pour AES
        cipher.init(Cipher.DECRYPT_MODE, secretKey); // Initialise `cipher` en mode déchiffrement (`DECRYPT_MODE`) avec `secretKey`
        byte[] octetsClairs = cipher.doFinal( // Déchiffre les octets et renvoie le `byte[]` du message d'origine
                Base64.getDecoder().decode(chiffre) // Reconvertit d'abord la `String` Base64 `chiffre` en `byte[]` chiffré
        ); // Fin de cipher.doFinal(...)
        return new String(octetsClairs); // Transforme le `byte[]` déchiffré en `String` lisible
    } // Fin de decryptAes

    // ==================== SHA-1 (`java.security.MessageDigest` + `java.util.HexFormat`) ====================

    public static String hashSha1(String mdp) throws Exception { // Calcule l'empreinte (haché) SHA-1 d'un mot de passe
        MessageDigest md = MessageDigest.getInstance("SHA-1"); // Récupère l'algorithme de hachage `"SHA-1"` via `MessageDigest`
        byte[] empreinte = md.digest(mdp.getBytes()); // Convertit `mdp` en `byte[]` avec `.getBytes()` et calcule le haché (`byte[]` de 20 octets pour SHA-1)
        return HexFormat.of().formatHex(empreinte); // Convertit le `byte[]` en `String` hexadécimale de 40 caractères (minuscules)
    } // Fin de hashSha1

    public static boolean verifySha1(String mdpSaisi, String hashStocke) throws Exception { // Vérifie un mot de passe en le rehachant et en comparant au haché stocké
        String hashCalcule = hashSha1(mdpSaisi); // Recalcule le haché SHA-1 du mot de passe saisi (pas de "déchiffrement" possible)
        return hashCalcule.equals(hashStocke); // Renvoie `true` si les deux empreintes hexadécimales sont identiques, `false` sinon
    } // Fin de verifySha1

    // ==================== BCRYPT (`at.favre.lib.crypto.bcrypt.BCrypt`) ====================

    public static String hashBcrypt(String mdp) { // Hache un mot de passe avec BCrypt (sel aléatoire + coût)
        return BCrypt.withDefaults() // Récupère l'implémentation BCrypt par défaut de la bibliothèque externe
                .hashToString(BCRYPT_COST, mdp.toCharArray()); // Génère un sel aléatoire, applique le coût `BCRYPT_COST` et renvoie la chaîne hachée
    } // Fin de hashBcrypt

    public static boolean verifyBcrypt(String mdpSaisi, String hashStocke) { // Vérifie un mot de passe saisi face à un haché BCrypt stocké
        return BCrypt.verifyer() // Récupère le vérificateur BCrypt
                .verify(mdpSaisi.toCharArray(), hashStocke) // Extrait sel/coût depuis `hashStocke` et compare avec `mdpSaisi`
                .verified; // Renvoie le booléen indiquant si la vérification a réussi
    } // Fin de verifyBcrypt

    // ==================== MAIN : TESTS SIMPLES & DOUBLE APPLICATION (x2) ====================

    public static void main(String[] args) throws Exception { // Point d'entrée du programme permettant de lancer tous les tests
        String mdp = "MonMotDePasse123"; // Mot de passe de test en clair
        String cle = "1234567890123456"; // Clé AES de 16 caractères (16 octets via `.getBytes()`)

        // --- 1. Tests simples ---
        String b64 = encodeBase64(mdp); // Encode en Base64
        System.out.println("Base64 simple : " + b64 + " -> " + decodeBase64(b64)); // Affiche l'encodage puis le décodage

        String aes = encryptAes(mdp, cle); // Chiffre en AES
        System.out.println("AES simple    : " + aes + " -> " + decryptAes(aes, cle)); // Affiche le chiffré puis le déchiffré

        String sha1 = hashSha1(mdp); // Hache en SHA-1
        System.out.println("SHA-1 simple  : " + sha1 + " -> ok ? " + verifySha1(mdp, sha1)); // Affiche le haché et vérifie `mdp`

        // --- 2. Double application (consignes 14 & 21) ---
        String b64x2 = encodeBase64(encodeBase64(mdp)); // Applique Base64 deux fois
        System.out.println("Base64 x2     : " + b64x2 + " -> " + decodeBase64(decodeBase64(b64x2))); // Il faut décoder 2 fois pour revenir à `mdp`

        String aesx2 = encryptAes(encryptAes(mdp, cle), cle); // Applique AES deux fois avec la même clé
        System.out.println("AES x2        : " + aesx2 + " -> " + decryptAes(decryptAes(aesx2, cle), cle)); // Il faut déchiffrer 2 fois pour revenir à `mdp`

        String sha1x2 = hashSha1(hashSha1(mdp)); // Hache le résultat d'un premier SHA-1
        System.out.println("SHA-1 x2      : " + sha1x2 + " -> correspond au mdp initial ? " + verifySha1(mdp, sha1x2)); // `false` : aucun retour arrière, et `sha1x2` hache le 1er haché

        // --- 3. Tests BCrypt (deux appels sur le même mdp + double application) ---
        String bc1 = hashBcrypt(mdp); // Premier hachage BCrypt
        String bc2 = hashBcrypt(mdp); // Deuxième hachage BCrypt du même `mdp` (différent grâce au sel aléatoire)
        System.out.println("BCrypt 1      : " + bc1); // Affiche le 1er haché BCrypt
        System.out.println("BCrypt 2      : " + bc2); // Affiche le 2e haché BCrypt
        System.out.println("bc1.equals(bc2): " + bc1.equals(bc2)); // `false` : sel aléatoire différent à chaque appel
        System.out.println("bc1 ok / bc2 ok: " + verifyBcrypt(mdp, bc1) + " / " + verifyBcrypt(mdp, bc2)); // `true` / `true` : les deux sont valides pour `mdp`

        String bcDouble = hashBcrypt(bc1); // Applique BCrypt une seconde fois sur la chaîne `bc1`
        System.out.println("BCrypt x2     : " + bcDouble); // Affiche le haché double
        System.out.println("x2 valide mdp : " + verifyBcrypt(mdp, bcDouble)); // `false` : `bcDouble` a été calculé à partir de `bc1`, pas de `mdp`
        System.out.println("x2 valide bc1 : " + verifyBcrypt(bc1, bcDouble)); // `true` : `bcDouble` vérifie bien `bc1`
    } // Fin de main
}
