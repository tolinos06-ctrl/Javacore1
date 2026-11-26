package javacore.chapter03.loop.practice;

public class PracticeLoopBreak {
    public static void main(String[] args){

        while(true){
            for(int i = 0;i < 10;i++){
                System.out.print(i);
                break;
            }
            break;
        }
    }
}
