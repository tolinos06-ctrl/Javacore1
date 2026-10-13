package javacore.javacore.chapteur04.function.exerciceChap4;

public class CoinChangerV4 {
    public static void main(String[] args){
        int totalBill = 152;
        int amountPaid = 200;
        int rendu = amountPaid - totalBill;
        int r50 = 3, r20 = 3, r10 = 3, r5 = 3, r2 = 3, r1 = 3;

        int b50 = calculerCoupures(rendu, r50, 50);
        rendu -= b50 * 50;
        r50 -= b50;

        int b20 = calculerCoupures(rendu, r20, 20);
        rendu -= b20 * 20;
        r20 -= b20;

        int b10 = calculerCoupures(rendu, r10, 10);
        rendu -= b10 * 10;
        r10 -= b10;

        int b5 = calculerCoupures(rendu, r5, 5);
        rendu -= b5 * 5;
        r5 -= b5;

        int p2 = calculerCoupures(rendu, r2, 2);
        rendu -= p2 * 2;
        r2 -= p2;

        int p1 = calculerCoupures(rendu, r1, 1);
        rendu -= p1 * 1;
        r1 -= p1;

        if (rendu != 0){
            System.out.println("Pas assez de monnaie ! Il reste " + rendu + "€ impayés.");
        } else {
            System.out.println("Monnaie rendue avec succès :");
            System.out.println(b50 + " billets de 50, " + b20 + " billets de 20, " + b10 + " billets de 10, " + b5 + " billets de 5, " + p2 + " pièce de 2, " + p1 + " pièce de 1");
        }
    }

    public static int calculerCoupures(int rendu, int stock, int valeur) {
        int aDonner = rendu / valeur;
        if (aDonner > stock) {
            aDonner = stock;
        }
        return aDonner;
    }
}