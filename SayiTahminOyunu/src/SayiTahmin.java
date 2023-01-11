import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi= rnd.nextInt(100);
        int right=0;
        Scanner scan=new Scanner(System.in);
        System.out.println(sayi);
        int [] tahminler=new int[5];
        while (right<5) {
            System.out.println("KALAN HAKKINIZ:"+( 5- right));
            System.out.print("Tahmininizi Griniz:");
            int tahmin = scan.nextInt();
            if (tahmin<0 || tahmin>99){
                System.out.println("Hatalı Giriş Yaptınız");
                right++;
            }
           else if (tahmin == sayi){
                System.out.println("Tebrikler Bildiniz");
                break;
            }
            else if (tahmin>sayi){
                System.out.println("Tahmininiz Sayıdan Büyük!");
                tahminler[right]=tahmin;
                right++;
            }
            else {
                System.out.println("Tahmininz Sayıdan Küçük!");
                tahminler[right]=tahmin;
                right++;
            }
        }
        if (right==5)
            System.out.println("Kaybettiniz:");
        System.out.println(Arrays.toString(tahminler));
    }
}
