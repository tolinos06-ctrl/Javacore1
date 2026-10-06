package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {
    public static void main(String[] args) {
        int start = 0;
        int end = 50;
        for(int i = start;i<=end;i++){
            int c = 0;
            for(int j = 1; j<i;j++){
                if(i%j == 0){
                    c+=j;
                }
            }
            if ( c== i){
                System.out.println(i + " est un nombre parfait");
            }
        }

    }
}
