package javacore.chapter05.object.exercise;

public class BubbleSorting {

    public static void main(String[] args) {

        int[] numbers = {30, 25, 85, 6, 43, 58, 97, 78, 94, 27, 9, 38, 41, 35, 52, 10, 16, 22, 96, 74, 44, 55, 82, 28, 83, 69, 90, 89, 26, 7, 47, 98, 50, 42, 68, 91, 70, 65, 79, 4, 75, 49, 61, 39, 48, 72, 36, 18, 1, 15, 77, 99, 33, 24, 13, 19, 73, 17, 14, 86, 54, 45, 76, 21, 100, 63, 60, 56, 93, 87, 81, 8, 29, 34, 53, 37, 71, 67, 57, 66, 11, 46, 95, 20, 88, 64, 59, 84, 12, 92, 80, 40, 23, 3, 2, 32, 31, 5, 62, 51};

        quickSort(numbers, 0, numbers.length - 1);

        // Affichage
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();



    }

    public int bubbleSorting(int[] numbers){
        for(int i = 0;i<=numbers.length-1;i++){
            for(int j = 0;j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }

            }

        }
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        return 0;
        // faiblesse, le code est long lent on recommence a chaque fois a partir du premier élément
        // force, on rétrécit petit a petit lees éléments mais uniquements a droite du tableau
    }

    public static void quickSort(int[] array, int low, int high){
        if(low<high){
            int index = partition(array,low,high);
            quickSort(array,low,index - 1);
            quickSort(array,index + 1,high);
        }
    }
    public static int partition(int[] array,int low, int high){
        int pivot = array[high];
        int i = low-1;
        for(int j = low;j<high;j++){ // on test si les éléments sont plus petits ou plus grands que le pivot
            if(array[j]<pivot){
                i++; // placement de la frontière, ce qui veut dire que tout ce qui y est avant est plus petit que le pivot actuel
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[i+1]; // le tableau est trié, les éléments plus petits que le pivot sont jusqu'a la position de la frontière i, donc la place du pivot est a i+1
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }
}
