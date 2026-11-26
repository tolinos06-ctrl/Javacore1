package javacore.chapter05.object.practice;

public class ExoPersoMultiplication {
    int nombre;
    int tailleMax;


    public ExoPersoMultiplication(int nombre, int tailleMax){
        this.nombre = nombre;
        this.tailleMax = tailleMax;
    }

    public int[] genererTable(){
        int [] result = new int[tailleMax];
        for(int i = 1;i<=tailleMax;i++){
            result[i-1] = i * nombre;
        }
        return result;
    }

    public void displayInformation(){
        int [] result = genererTable();
        System.out.print("Voici les " + this.tailleMax + " premiers multiples de " + this.nombre + " : ");
        for(int i =0;i<=tailleMax-1;i++){
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args){
        ExoPersoMultiplication maTable = new ExoPersoMultiplication(5,3);
        maTable.displayInformation();
    }
}
