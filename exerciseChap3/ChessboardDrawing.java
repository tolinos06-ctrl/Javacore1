package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {
    public static void main(String[] args) {
        int chessboardSize = 5;
        int c = 0;
        for(int i = 0; i<chessboardSize; i++){
            for(int j = 0;j<chessboardSize;j++){
                if(c % 2 == 0){
                    System.out.print(" # ");
                    c+=1;
                }
                else{
                    System.out.print(" . ");
                    c+=1;
                }
            }
            System.out.println("");
        }
    }
}
