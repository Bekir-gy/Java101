import java.util.Scanner;

public class KDVHesap {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.print("ÜRÜN FİYATI GİRİN:");
        double fiyat=scan.nextInt();

        boolean kdvsart=fiyat>1000;
        double kdvorani=kdvsart ? 0.08: 0.18;

        Double kdvli= fiyat*kdvorani;
        Double sonuc=fiyat+kdvli;

        System.out.println("Kdv'siz fiyat:"+fiyat);
        System.out.println("KDV ORANI:"+kdvorani);
        System.out.println("KDV TUTARI:"+kdvli);
        System.out.println("KDVLİ FİYAT:"+sonuc);

    }
}
