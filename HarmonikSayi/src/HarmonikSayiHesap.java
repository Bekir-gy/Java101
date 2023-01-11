import java.util.Scanner;

public class HarmonikSayiHesap {
    public static void main(String[] args) {
        int sayi;
        double sonuc=0;
        Scanner scan=new Scanner(System.in);

        System.out.print("Sayiyi Giriniz:");
        sayi=scan.nextInt();

        for (double i=1;i<=sayi;i++){
            sonuc=sonuc+(1/i);
        }
        System.out.println(sayi+" Sayisinin Harmonik Sonucu: "+sonuc);
    }
}
