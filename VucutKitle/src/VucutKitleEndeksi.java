import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy,kilo,sonuc;
        Scanner scan=new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz: ");
        kilo=scan.nextDouble();

        System.out.print("Boyunuzu Giriniz: ");
        boy=scan.nextDouble();

        sonuc=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz: "+ sonuc);
    }
}
