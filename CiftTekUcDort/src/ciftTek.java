import java.util.Scanner;

public class ciftTek {
    public static void main(String[] args) {
       /** for ile
        *
           int sayi;
        Scanner scan=new Scanner(System.in);

        System.out.print("Sayiyi Girin:");
        sayi=scan.nextInt();

        for (int i=0;i<=sayi;i++){
            if (i%2==0){
                System.out.println("Cift Olanlar: "+i);
            }

        }*/

        int i=0,sayi;
        Scanner scan=new Scanner(System.in);

        System.out.print("Sayiyi Girin:");
        sayi=scan.nextInt();

        while (i<=sayi){
            if (i%2==0){
                System.out.println("Çift Olanlar:"+i);
            }
            i++;
        }


    }
}
