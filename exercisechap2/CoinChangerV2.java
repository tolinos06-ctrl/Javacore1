package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {
    public static void main(String[] args){
        int totalBill = 152;
        int amountBill = 1000;
        //rbillet correspond au nombre restant de billets
        int r50=3,r20=3,r10=3,r5=3,r2=3,r1=3;
        int rendu = amountBill-totalBill;
        int b50 = 0,b20 = 0, b10 = 0, b5 = 0,p2 = 0, p1 = 0;
        while(rendu >= 50 && r50 >0){rendu -=50; b50 +=1;r50-=1;}
        while(rendu >= 20 && r20>0){rendu -= 20; b20 +=1;r20-=1;}
        while(rendu>=10 && r10>0){rendu -=10;b10 +=1;r10-=1;}
        while(rendu>=5 && r5>0){rendu -=5;b5 +=1;r5-=1;}
        while(rendu>=2 && r2>0){rendu -=2;p2+=1;r2-=1;}
        while(rendu>=1 && r1>0){rendu-=1;p1 +=1;r1-=1;}
        if(rendu>0){
            System.out.println(b50+" billets de 50 \n" + b20+" billets de 20\n " + b10+"billets de 10 \n" + b5+" billets de 5 \n" + p2+" pièce de 2 \n" + p1+" pièce de 1 \n" + "plus de monaie reste = " + rendu);
        }
        else {
            System.out.println(b50 + " billets de 50 " + b20 + " billets de 20 " + b10 + " billets de 10 " + b5 + " billets de 5 " + p2 + " pièce de 2 " + p1 + " pièce de 1");
        }
    }
}
