import java.util.Scanner;

public class Ebobekok {
    public static void main(String[] args) {
        int sayi1,sayi2,ebob=1,ekok=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayıyi Girin:");
        sayi1= scan.nextInt();

        System.out.print("2.sayiyi Girin:");
        sayi2= scan.nextInt();

        //1.sayiyi en küçük kabul edersek



        /**
         * 1.yol Ebob için asal olmayan iki sayıda daha çok maliyetli
         */
        /*for (int i=1;i<=sayi1;i++){
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        System.out.println("Sayıların Ebob Değeri:"+ebob);*/

        /**
         * 2.yol Ebob için asal olmayan iki sayıda daha az maliyetli
         */

       for (int i=sayi1;i>=1;i--){
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
                System.out.println("Sayilarin Ebob Değeri:"+ebob);
                break;
            }
        }

        /**
         * ekok 1.yol ebob formülsüz bulma
         */

        for (int i=1;i<=sayi1*sayi2;i++){
            if (i%sayi1==0 && i%sayi2==0){
                ekok=i;
                System.out.println("EKOK:"+ ekok);
                break;
            }
        }

        /**
         * ekok 2.yol ebob formüllü olan
         */
        System.out.println("Ekok:"+(sayi1*sayi2)/ebob);
    }
}
