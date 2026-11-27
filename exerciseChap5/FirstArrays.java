package javacore.chapter05.object.exercise;
import java.util.Arrays;
public class FirstArrays {
    public static void main(String[] args) {

        int[] integerArray = new int[10];

        integerArray[0] = 1;
        for(int i = 1;i<integerArray.length;i++){
            integerArray[i] = i+1;}

        displayArray(integerArray);

    }
    public static void displayArray(int[] array){
        System.out.print("  Valeurs du tableau : ");
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int j = 0;j<array.length;j++){
            System.out.print(array[j]*3 + " ");
        }
        System.out.println();
        for(int k =0;k<array.length;k++){
            if(array[k] % 2 == 0){
                System.out.print(array[k] + " ");
            }
        }
        System.out.println();
        for(int n = 0;n<array.length-1;n++){
            if(array[n] % 3 == 0){
                array[n-1] = 0;
            }
        }
        System.out.print(Arrays.toString(array));

    }
}
