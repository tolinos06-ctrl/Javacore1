package javacore.chapter01.variable.exercise;

public class FirstOperations {
    public static void main(String[] args){
        int a = 2,b = 3;
        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b ;
        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);


        int c = 2, d = 8;
        c +=d; //c =c + d
        System.out.println(c);
        d -= 5; //d = d - 5
        System.out.println(d);
        c *= 3; //c = c * 3
        System.out.println(c);
        d /= 3; // d = d / 3
        System.out.println(d);


        int e = 1 * 5 + 2;
        System.out.println(e);
        int f = 1 * (5 + 2);
        System.out.println(f);
        int g = ((2 * 5) - 2 / (4 - 2)) - 1;
        System.out.println(g);
    }
}
