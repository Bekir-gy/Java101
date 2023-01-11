import java.util.Scanner;

public class DifferentFW {
    public static void main(String[] args) {
        // sonunu bilmediğimiz yerlerde while avantajı
        int sayi;
        boolean run=true;
        Scanner scan= new Scanner(System.in);

       /* for (boolean run=true; run;){
            System.out.print("Sayı Giriniz:");
            sayi=scan.nextInt();
            if (sayi<0){
                run=false;
            }
        }*/

      /** while boolean yöntem
        while (run){
            System.out.print("Sayi Giriniz:");
            sayi=scan.nextInt();
            if (sayi<0){
                run=false;
            }
        }
       */

       /* While 2.yöntem
       System.out.print("Sayi Girin:");
        sayi=scan.nextInt();
        while (sayi > 0) {
            System.out.print("Sayi Girin:");
            sayi= scan.nextInt();
        }
        */

        do {
            System.out.print("Sayi Girin");
            sayi= scan.nextInt();
        }while (sayi>0);

    }
}
