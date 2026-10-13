package javacore.chapter03.loop.exercise;

public class ForLoopExample {
    public static void main(String[] args) {
        for(int i =2;i<=20;i+=2){
            System.out.print(" " + i);
        }
        System.out.print("\n");
        for(char j = 'A'; j<90;j++){
            System.out.print(" " + j);
        }
        System.out.print("\n");
        int k1 = 10;
        int k = k1;
        int factorielle = 1;
        for (;k1>0;k1--){
            factorielle *= k1;
        }
        System.out.print("La factorielle de "+ k +" est " + factorielle);
    }
}
