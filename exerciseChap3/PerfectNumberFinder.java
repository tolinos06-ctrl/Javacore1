package javacore.chapter03.loop.exerciseChap3;

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
        finder();
    }

        // refait apres avoir finis histoire d'etre sur
    public static void finder(){
        for(int i = 1;i<=50;i++){
            int c = 0;
            for(int j = 1;j<=i/2;j++){
                if(i%j == 0){
                    c += j;
                }
            }
            if(c == i){
                System.out.println(i + " est un nombre parfait");
            }
        }
    }
}
