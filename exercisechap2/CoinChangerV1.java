package javacore.chapter02.condition.exercisechap2;

public class CoinChangerV1 {
    public static void main(String[] args){
        int totalBill = 152;
        int amountPaid = 200;
        int rendu = amountPaid-totalBill;
        int b50 = 0,b20 = 0, b10 = 0, b5 = 0,p2 = 0, p1 = 0;
        if(rendu>=50){
            b50 = rendu /50; rendu = rendu -(b50 *50);
        }
        if(rendu >= 20){
            b20 = rendu/20;rendu = rendu-(b20*20);
        }
        if(rendu >=10){
            b10 = rendu / 10;rendu = rendu - (b10*10);
        }
        if(rendu>=5){
            b5 = rendu/5;rendu = rendu -(b5*5);
        }
        if(rendu>=2){
            p2 = rendu/2;rendu = rendu - (p2*2);
        }
        if(rendu>=1){
            p1 = rendu;
        }
        System.out.println(b50+" billets de 50 " + b20+" billets de 20 " + b10+" billets de 10 " + b5+" billets de 5 " + p2+" pièce de 2 " + p1+" pièce de 1");
    }
}
