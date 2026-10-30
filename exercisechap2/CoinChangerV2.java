package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {
    public static void main(String[] args){
        int totalBill = 152;
        int amountPaid = 353;
        // rbillet correspond au nombre restant de billets
        int r50 = 3, r20 = 3, r10 = 3, r5 = 3, r2 = 3, r1 = 3;
        int rendu = amountPaid - totalBill;
        int b50 = 0, b20 = 0, b10 = 0, b5 = 0, p2 = 0, p1 = 0;

        // 50€
        if(rendu >= 50 && r50 > 0){
            b50 = rendu / 50;
            if (b50 > r50) { b50 = r50; } // On se limite au stock disponible
            rendu = rendu - (b50 * 50);
            r50 -= b50; // On décrémente le stock du nombre exact de billets donnés
        }

        // 20€
        if(rendu >= 20 && r20 > 0){
            b20 = rendu / 20;
            if (b20 > r20) { b20 = r20; }
            rendu = rendu - (b20 * 20);
            r20 -= b20;
        }

        // 10€
        if(rendu >= 10 && r10 > 0){
            b10 = rendu / 10;
            if (b10 > r10) { b10 = r10; }
            rendu = rendu - (b10 * 10);
            r10 -= b10;
        }

        // 5€
        if(rendu >= 5 && r5 > 0){
            b5 = rendu / 5;
            if (b5 > r5) { b5 = r5; }
            rendu = rendu - (b5 * 5);
            r5 -= b5;
        }

        // 2€
        if(rendu >= 2 && r2 > 0){
            p2 = rendu / 2;
            if (p2 > r2) { p2 = r2; }
            rendu = rendu - (p2 * 2);
            r2 -= p2;
        }

        // 1€
        if(rendu >= 1 && r1 > 0){
            p1 = rendu;
            if (p1 > r1) { p1 = r1; }
            rendu = rendu - (p1 * 1);
            r1 -= p1;
        }

        // Vérification finale propre avec un if/else
        if (rendu != 0){
            System.out.println("Pas assez de monnaie ! Il reste " + rendu + "€ impayés.");
        } else {
            System.out.println("Monnaie rendue avec succès :");
            System.out.println(b50 + " billets de 50, " + b20 + " billets de 20, " + b10 + " billets de 10, " + b5 + " billets de 5, " + p2 + " pièce de 2, " + p1 + " pièce de 1");
        }
    }
}