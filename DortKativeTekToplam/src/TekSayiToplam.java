import java.util.Scanner;

public class TekSayiToplam {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi Girin:");
        sayi=scan.nextInt();

        while (sayi>0){
            if (sayi%2==1){
                toplam+=sayi;
            }
            System.out.print("Sayi Girin:");
            sayi=scan.nextInt();

        }
        System.out.println("Girilen Sayılardan TEK olanların Toplamı:"+toplam);

    }
}
