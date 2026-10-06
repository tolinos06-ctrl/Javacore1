package javacore.chapter02.condition.exercisechap2;

public class CoinChangerV2 {
    public static void main(String[] args){
        int totalBill = 152;
        int amountPaid = 1000;
        //rbillet correspond au nombre restant de billets
        int r50=3,r20=3,r10=3,r5=3,r2=3,r1=3;
        int rendu = amountPaid-totalBill;
        int b50 = 0,b20 = 0, b10 = 0, b5 = 0,p2 = 0, p1 = 0;
        if(rendu>=50 && r50>0){
            b50 = rendu /50; rendu = rendu -(b50 *50);r50-=1;
        }
        if(rendu >= 20 && r20 >0){
            b20 = rendu/20;rendu = rendu-(b20*20);r20-=1;
        }
        if(rendu >=10 && r10 >0){
            b10 = rendu / 10;rendu = rendu - (b10*10);r10-=1;
        }
        if(rendu>=5 && r5>0){
            b5 = rendu/5;rendu = rendu -(b5*5);r5-=1;
        }
        if(rendu>=2 && r2>0){
            p2 = rendu/2;rendu = rendu - (p2*2); r2-=1;
        }
        if(rendu>=1 && r1>0){
            p1 = rendu;r1-=1;
        }
        if (rendu !=0){
            System.out.print("Pas assez de monnaie");
        }
        System.out.println(b50+" billets de 50 " + b20+" billets de 20 " + b10+" billets de 10 " + b5+" billets de 5 " + p2+" pièce de 2 " + p1+" pièce de 1");
    }
}
