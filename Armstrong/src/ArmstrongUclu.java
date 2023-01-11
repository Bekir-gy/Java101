import java.util.Scanner;

public class ArmstrongUclu {
    public static void main(String[] args) {
        int sayi,toplam=0,countNumber=0,basamak,usResult=1;
       // Scanner scan=new Scanner(System.in);
           for (int k=1;k<=999;k++) {


               //System.out.print("Sayiyi Giriniz:");
               //sayi=scan.nextInt();
               int tempSayi = k;
               while (tempSayi != 0) {
                   tempSayi /= 10;
                   // System.out.println("Sayi:"+tempSayi);
                   countNumber++;
               }
               tempSayi = k;
               //System.out.println("Basamak:" + countNumber);

               while (tempSayi != 0) {
                   basamak = tempSayi % 10;
                   //System.out.println("basamak: " + basamak);
                   for (int i = 1; i <= countNumber; i++) {
                       usResult *= basamak;
                   }
                   //System.out.println("us:" + usResult);
                   toplam += usResult;
                   //System.out.println(toplam);
                   usResult = 1;
                   tempSayi /= 10;
               }
               if (k == toplam) {
                   System.out.println(k + " SAYISI ARMSTRONG SAYISIDIR SONUÇ: " + toplam);

               }
               toplam = 0;
               countNumber=0;
               /*else
                System.out.println(k + " Armstrong değil :" + toplam);*/
           }
    }
}
