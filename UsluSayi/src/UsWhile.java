import java.util.Scanner;

public class UsWhile {
    public static void main(String[] args) {
        int taban,us,i=1,sonuc=1;
        Scanner scan=new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayi:");
        taban=scan.nextInt();

        System.out.print("Üssünü Giriniz:");
        us=scan.nextInt();

        while (i<=us){
            sonuc*=taban;
            i++;
        }
        System.out.println(taban+" Sayisinin "+us+" üssü: "+sonuc);

    }
}
