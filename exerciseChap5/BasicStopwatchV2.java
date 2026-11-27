package javacore.chapter05.object.exercise;

public class BasicStopwatchV2 {
    int secondes = 0;
    int minutes = 0;
    int heures = 0;
    public void displayInformation(String name){
        System.out.print("\r" + name +" : " + heures + " H " + minutes + " min " + secondes + " s ");
    }


    public void launch(String name) throws InterruptedException{
        while(true){
            displayInformation(name);

            Thread.sleep(1000);
            secondes ++;
            if(secondes == 60){
                minutes += 1;
                secondes = 0;
                if(minutes == 60){
                    heures +=1;
                    minutes = 0;
                }
            }
        }


    }

    public static void main(String[] args) throws InterruptedException{
        BasicStopwatchV2 watch = new BasicStopwatchV2();

        watch.launch("Oeufs Durs");
    }


}
