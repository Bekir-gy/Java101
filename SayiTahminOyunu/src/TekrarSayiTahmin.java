import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TekrarSayiTahmin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int [] tahminler=new int[5];
        boolean isWin=false;
        boolean isWrong=false;
        Random rnd=new Random();
        int GercekSayi= rnd.nextInt(100);
        for (int i=0;i<5;i++){
            System.out.println("Kalan Hakkınız:"+(5-tahmin));
            System.out.print("Tahmininizi Giriniz:");
            int sayi=scan.nextInt();
            if (sayi<0 || sayi>99){
                if (isWrong){
                    tahmin++;
                    System.out.println("Çok hatalı giriş yaptınız.. Kalan Hakkınız:"+(5-tahmin));
                }else {
                    isWrong=true;
                    System.out.println("Hatalı Giriş Bir daha hatalı girişte Hakkınızdan Düşülecek.");
                    i--;
                }
            }else if (sayi==GercekSayi){
                System.out.println("Tebrikler..Kazandınız");
                isWin=true;
                break;
            }else if (sayi>GercekSayi){
                tahminler[tahmin]=sayi;
                tahmin++;
                System.out.println("Tahmininiz Sayidan Büyük.. Kalan Hakkınız:"+(5-tahmin));
            }else {
                tahminler[tahmin]=sayi;
                tahmin++;
                System.out.println("Tahmininz Sayidan Küçük.. Kalan Hakkınız:"+(5-tahmin));
            }
        }
        if (!isWin){
            System.out.println("Kaybettiniz...");
            if (!isWrong)
                System.out.println(Arrays.toString(tahminler));
        }
    }
}