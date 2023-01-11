import java.util.Scanner;

public class TekSayiToplamDoWhile {
    public static void main(String[] args) {
        int sayi,toplam=0;

        Scanner scan= new Scanner(System.in);

       do {
           System.out.print("Sayi Girin:");
           sayi=scan.nextInt();
           if (sayi%2==1){
               toplam+=sayi;
           }

       }while (sayi>0);

        System.out.println("Tek olanların Toplamı:"+toplam);


    }
}
