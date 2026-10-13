package javacore.javacore.chapteur04.function.exerciceChap4;

public class FunctionOverload {
    public static void main(String[] args) {
        System.out.println(sum2(12,5,3));
    }
    public static int sum(int number1,int number2){
        return number1+number2;
    }
    public static int sum2(int number1,int number2, int number3){
        return sum(number1,number2) + number3;
    }
}
