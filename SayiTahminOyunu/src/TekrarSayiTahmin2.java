import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TekrarSayiTahmin2 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi= rnd.nextInt(100);
        int right=0;
        boolean isWin=false;
        boolean isWrong=false;
        int [] tahminler=new int[5];
        Scanner scan=new Scanner(System.in);
        while (right<5){
            System.out.println("KALAN Hakkınız:"+(5-right));
            System.out.print("Tahmininizi Giriniz:");
            int tahmin=scan.nextInt();
            if (tahmin<0 || tahmin>99){
                if (isWrong){
                    right++;
                    System.out.println("Çok Hatalı Girdiniz: Kalan Hak:"+(5-right));
                }else {
                    isWrong=true;
                    System.out.println("Hatalı Giriş Bir Daha olursa Hakdan Düşülecek.");
                }
                continue;
            }if (tahmin==sayi){
                System.out.println("Tebrikler Bildiniz... Sayi:"+sayi);
                isWin=true;
                break;
            }else {
                if (tahmin>sayi){
                    System.out.println("Tahmininz Sayidan Büyük.. ");
                }else {
                    System.out.println("Tahmininiz Sayıdan Küçük.. ");
                }
                tahminler[right++]=tahmin;
                System.out.println("KALAN HAK:"+(5-right));
            }
        }
        if (!isWin){
            System.out.println("Kaybettiniz.. Sayi:"+sayi);
            if (!isWrong)
                System.out.println(Arrays.toString(tahminler));
        }
    }
}