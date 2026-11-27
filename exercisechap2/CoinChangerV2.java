package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {
    public static void main(String[] args){
        int totalBill = 152;
        int amountPaid = 353;
        int nombreBillets50 = 3, nombreBillets20 = 3, nombreBillets10 = 3, nombreBillets5 = 3, nombrePieces2 = 3, nombrePieces1 = 3;
        int rendu = amountPaid - totalBill;
        int compteBillets50 = 0, compteBillets20 = 0, compteBillets10 = 0, compteBillets5 = 0, comptePieces2 = 0, comptePieces1 = 0;

        // 50€
        if(rendu >= 50 && nombreBillets50 > 0){
            compteBillets50 = rendu / 50;
            if (compteBillets50 > nombreBillets50) { compteBillets50 = nombreBillets50; }
            rendu = rendu - (compteBillets50 * 50);
            nombreBillets50 -= compteBillets50;
        }

        // 20€
        if(rendu >= 20 && nombreBillets20 > 0){
            compteBillets20 = rendu / 20;
            if (compteBillets20 > nombreBillets20) { compteBillets20 = nombreBillets20; }
            rendu = rendu - (compteBillets20 * 20);
            nombreBillets20 -= compteBillets20;
        }

        // 10€
        if(rendu >= 10 && nombreBillets10 > 0){
            compteBillets10 = rendu / 10;
            if (compteBillets10 > nombreBillets10) { compteBillets10 = nombreBillets10; }
            rendu = rendu - (compteBillets10 * 10);
            nombreBillets10 -= compteBillets10;
        }

        // 5€
        if(rendu >= 5 && nombreBillets5 > 0){
            compteBillets5 = rendu / 5;
            if (compteBillets5 > nombreBillets5) { compteBillets5 = nombreBillets5; }
            rendu = rendu - (compteBillets5 * 5);
            nombreBillets5 -= compteBillets5;
        }

        // 2€
        if(rendu >= 2 && nombrePieces2 > 0){
            comptePieces2 = rendu / 2;
            if (comptePieces2 > nombrePieces2) { comptePieces2 = nombrePieces2; }
            rendu = rendu - (comptePieces2 * 2);
            nombrePieces2 -= comptePieces2;
        }

        // 1€
        if(rendu >= 1 && nombrePieces1 > 0){
            comptePieces1 = rendu;
            if (comptePieces1 > nombrePieces1) { comptePieces1 = nombrePieces1; }
            rendu = rendu - (comptePieces1 * 1);
            nombrePieces1 -= comptePieces1;
        }

        if (rendu != 0){
            System.out.println("Pas assez de monnaie ! Il reste " + rendu + "€ impayés.");
        } else {
            System.out.println("Monnaie rendue avec succès :");
            System.out.println(compteBillets50 + " billets de 50, " + compteBillets20 + " billets de 20, " + compteBillets10 + " billets de 10, " + compteBillets5 + " billets de 5, " + comptePieces2 + " pièce de 2, " + comptePieces1 + " pièce de 1");
        }
    }
}