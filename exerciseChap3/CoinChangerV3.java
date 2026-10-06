package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {
    public static void main(String[] args){
        int totalBill = 152;
        int amountBill = 200;
        int rendu = amountBill-totalBill;
        int b50 = 0,b20 = 0, b10 = 0,p2 = 0, p1 = 0;
        while(rendu >= 50){rendu -=50; b50 +=1;}
        while(rendu >= 20){rendu -= 20; b20 +=1;}
        while(rendu>=10){rendu -=10;b10 +=1;}
        while(rendu>=2){rendu -=2;p2+=1;}
        while(rendu>=1){rendu-=1;p1 +=1;}
        System.out.println(b50+" billets de 50 " + b20+" billets de 20 " + b10+" billets de 10 " + p2+" pièce de 2 " + p1+" pièce de 1");
    }
}
