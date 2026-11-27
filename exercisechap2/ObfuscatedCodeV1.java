package javacore.chapter02.condition.exercise;

public class ObfuscatedCodeV1 {

    public static void main(String[] args) {

        int typeVéhicule = 1; // Type de véhicule (1 = moto, 2 = voiture, 3 = camion)

        double distance = 100; // Distance

        boolean e = true;
        double d = 0.03;

        double prix = 0; //prix du péage
        //si le véhicule est une moto, on applique le tarif de 1 centime du kilimètre
        if (typeVéhicule == 1) {
            prix = distance * 0.10;
        }
        if (typeVéhicule == 2) {
            prix = distance * 0.20;
        }
        if (typeVéhicule == 3) {
            prix = distance * 0.35;
        }
        //réduction si entrée en court de route
        if (e) {
            prix = prix - (distance * d);
        }

        System.out.println("Vous devez payer : " + prix + "€");

    }
}
