import java.util.Scanner;

public class TaksiHesap {
    public static void main(String[] args) {

        double km=2.20,mesafe,tutar,sonTutar;
        int baslangic=10;

        Scanner scan=new Scanner(System.in);
        System.out.print("Gidilecek mesafe kaç km:");
        mesafe=scan.nextDouble();

        tutar=(mesafe*km)+baslangic;
       /**
           kontrolün 1.yolu bu yolda 2 değişken fazladan var Kmkontrol ve SonTutar
        boolean Kmkontrol=tutar<20;
        sonTutar=Kmkontrol ? 20: tutar;
        System.out.println("Taksimetre Tutarı: "+sonTutar);
        */
       /*
          kontrolün 2.yolu alttaki bu 2 değişken daha az yazdırır booleana gerek yoktur
        */
        tutar=(tutar<20) ? 20:tutar;
        System.out.println("Taksimetre Tutarı: "+tutar);

    }
}
