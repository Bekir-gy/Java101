import java.util.Scanner;

public class UsFor {
    public static void main(String[] args) {
        int taban,us,sonuc=1;
        Scanner scan=new Scanner(System.in);

        System.out.print("Üssü alinacak sayiyi giriniz:");
        taban=scan.nextInt();

        System.out.print("Üssünü Giriniz:");
        us=scan.nextInt();
        for (int i=1;i<=us;i++){
            sonuc*=taban;
        }
        System.out.println(taban+" Sayisinin "+us+" üssü :"+sonuc);
    }
}
