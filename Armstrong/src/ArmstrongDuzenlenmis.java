import java.util.Scanner;

public class ArmstrongDuzenlenmis {
    public static void main(String[] args) {
        int sayi,toplam=0,countNumber=0,hesap,ustemp=1;
        Scanner scan=new Scanner(System.in);

        System.out.print("Sayiyi Giriniz:");
        sayi= scan.nextInt();
        int tempSayi=sayi;

        while (tempSayi!=0){
            tempSayi/=10;
            //System.out.println(sayi);
            countNumber++;

        }
        tempSayi=sayi;
        System.out.println("hane:"+countNumber);
        System.out.println("sayimiz:"+tempSayi);
        System.out.println();

        while (tempSayi!=0){
            hesap=tempSayi%10;
            for (int i=1;i<=countNumber;i++ ){
                ustemp*=hesap;
            }
            System.out.println(hesap+" üssü "+countNumber+": "+ustemp);
            System.out.println(toplam+" + "+ustemp+": "+(toplam+=ustemp));
            ustemp=1;
            tempSayi/=10;
        }
        if (sayi==toplam){
            System.out.println(sayi+" sayisi bir armstrong sayisidir sonuç: "+toplam);
        }else
            System.out.println(sayi+" sayisi bir armstrong sayisi değildir sonuç: "+toplam);
    }
}
