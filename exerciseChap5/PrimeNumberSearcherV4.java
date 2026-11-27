package javacore.chapter05.object.exercise;

public class PrimeNumberSearcherV4 {
    public static void main(String[] args) {
        //On fais une boucle for jusqu'a la raciné carée de notre limite, on en fait une seconde a l'intérieur afin de passer en revue tout les multiples de notre première boucle
        //si i%j == 0 alors on supprime j, sinon on le laisse. On fait monter i apres avoir tester tout les éléments et on continue comme ca.
        int nombre_premier = 10000;
        boolean [] est_premier = new boolean[nombre_premier +1];
        for(int k = 2;k<=nombre_premier;k++){
            est_premier[k] = true;
        }
        for(int i = 2;i<=Math.sqrt(nombre_premier);i++){
            if(est_premier[i]){
                for(int j = i*i;j<=nombre_premier;j+=i){
                    est_premier[j] = false;
                }
            }

        }
        System.out.println("Nombres premiers jusqu'à " + nombre_premier + " :");
        for (int i = 2; i <= nombre_premier; i++) {
            if (est_premier[i]) {
                System.out.print(i + " ");
            }

        }
    }
}
