package javacore.chapter03.loop.exercise;

public class FullPyramid {
    public static void main(String[] args) {
        int numberOfRows = 8;
        for(int i =0; i < numberOfRows;i++){
            int currentLine = i;
            for(int j = 0; j< (numberOfRows - currentLine);j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * currentLine + 1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}