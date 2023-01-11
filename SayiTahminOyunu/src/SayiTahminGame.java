import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminGame {
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        int right=0;
        boolean isWin=false;
        boolean isWrong=false;
        int [] tahminler=new int[5];
        Scanner scan=new Scanner(System.in);
        while (right<5){
            System.out.println("Kalan Hakkınız:"+(5-right));
            System.out.print("Tahminizi Giriniz:");
            int tahmin=scan.nextInt();
            if (tahmin<0 || tahmin>99){
                if (isWrong){
                    right++;
                    System.out.println("Çok Hatalı Girdiniz: Kalan Hakkınız "+(5-right));
                }else {
                    isWrong=true;
                    System.out.println("Bir kere daha hatalı girerseniz hakkınızdan düşülecektir");
                }
            }
            else if (tahmin==sayi){
                isWin=true;
                System.out.println("Tebrikler Kaazandınız. Sayı:"+tahmin);
                break;
            }
            else if (tahmin<sayi){
                tahminler[right]=tahmin;
                right++;
                System.out.println("Tahminiz Sayıdan KÜÇÜK. Kalan Hakkınız:"+(5-right));
            }
            else {
                tahminler[right]=tahmin;
                right++;
                System.out.println("Tahmininiz Sayıdan BÜYÜK KALAN HAKKINIZ:"+(5-right));
            }
        }
        if (!isWin){
            System.out.println("KAYBETTİNİZ...");
            if (!isWrong)
                System.out.println(Arrays.toString(tahminler));
        }
    }
}
