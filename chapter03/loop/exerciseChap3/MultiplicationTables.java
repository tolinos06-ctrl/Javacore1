package javacore.chapter03.loop.exerciseChap3;

public class MultiplicationTables {
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++){
            System.out.print("Table de " + i+ " = ");
            for(int j = 1;j<=10;j++){

                System.out.print(" " + (i*j));
            }
            System.out.println();
        }
            System.out.println();
    }
}
