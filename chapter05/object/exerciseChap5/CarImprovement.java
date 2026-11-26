package javacore.chapter05.object.exercise;

public class CarImprovement {
        String serialNumber;
        String brand;
        String model;
        String color ;

        boolean isEngineStarted ;

        double price ;
        double odometer;

        // isEngineStarted ne figure pas dans les paramètres constructeur car ce n'est pas le constructeur qui en décide
        // c'est la fonction run qui devrait avoir un impact, si on veut rouler, il fzut que le moteur soit en marche
        public CarImprovement(String serialNumber, String brand, String model, String color, double price){

            this.serialNumber = serialNumber;
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.price = price;
            this.odometer = 0;

            this.displayInformations();


        }
        // créer une fonction boolean pour faire l'action de démarrer la voiture
        public boolean start(){
            isEngineStarted = true;
            System.out.println("On démarre le moteur");
            return isEngineStarted;
        }
        // on ne peut pas rouler si le moteur n'est pas démarré
        public double run(double distance){
            if(isEngineStarted){
                System.out.println("La voiture roule pendant " + distance + " kms");
                odometer += distance;
            }
            else{
                System.out.println("La voiture n'est pas démarrée");

            }
            return distance;
        }
        public void displayInformations(){
            System.out.println("|N° série " + this.serialNumber + "| Marque : " + this.brand +  "| Modèle : " + this.model + "| Couleur : " + this.color + "| Kilométrage " + this.odometer);
        }
}
