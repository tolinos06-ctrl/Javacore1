package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {
    public static void main(String[] args) {
        int c =0;
        for (int i = 2; i <= 100; i++) {
            int j = 2;

            for (; j < i && i % j != 0; j++) {}

            if (j == i) {
                c += 1;
                if(c<=5){
                    System.out.println(i + " est premier");
                }
            }
        }
    }
}