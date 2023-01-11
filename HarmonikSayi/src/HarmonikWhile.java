import java.util.Scanner;

public class HarmonikWhile {
    public static void main(String[] args) {
        int sayi;
        double sonuc=0,k=1;
        Scanner scan=new Scanner(System.in);

        System.out.print("Sayiyi Giriniz:");
        sayi= scan.nextInt();
        while (k<=sayi){
            sonuc=sonuc+(1/k);
            k++;
        }
        System.out.println(sayi+" Sayisinin Harmonik Sonucu: "+sonuc);
    }
}
