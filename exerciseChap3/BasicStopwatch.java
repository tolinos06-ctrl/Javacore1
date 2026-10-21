package javacore.chapter03.loop.exercise;

public class BasicStopwatch {
    public static void main(String[] args) throws InterruptedException {
        int seconde= 0;
        int i = 0;
        int heure = 0;
        int minute = 0;

        /*
         * Une boucle while qui itèrera 100x grâce à l'incrémentation de la variable i (à la fin de la boucle)
         */
        while(i < 100) {

            /*
             * Effectue une "pause" de 1000 millisecondes / 1 seconde
             */
            Thread.sleep(1000);
            seconde += 1;

            if(seconde == 60){
                minute += 1;
                seconde = 0;
                if(minute == 60){
                    heure +=1;
                    minute = 0;
                }
            }
            if(seconde<10){
                if(minute<10){
                    if(heure<10){
                        System.out.print("\r" + "0" + heure + " : 0" + minute + " : 0" + seconde);
                    }
                    System.out.print("\r" + heure + " : 0" + minute + " : 0" + seconde);
                }
                else{
                System.out.print("\r" + heure + " : " + minute + " : 0" + seconde);}
            }
            else if(minute<10){
                if(heure<10){
                    System.out.print("\r" + "0" + heure + " : 0" + minute + " : " + seconde);
                }
                else{
                    System.out.print("\r" + heure + " : 0" + minute + " : " + seconde);
                }

            }
            else if(heure<10) {
                System.out.print("\r" + "0" + heure + " : " + minute+ " : " + seconde);
            }
            else{
                System.out.print("\r" + heure + " : " + minute + " : " + seconde);
            }
        }

    }
}