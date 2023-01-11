import java.util.Scanner;

public class basamakSayi {
    public static void main(String[] args) {
        int sayi,basamak,toplam=0,tempSayi;
        Scanner scan=new Scanner(System.in);

        System.out.print("Sayiyi Giriniz:");
        sayi=scan.nextInt();
        tempSayi=sayi;
        while (sayi!=0){
            basamak=sayi%10;
            toplam+=basamak;
            sayi/=10;
        }
        System.out.println(tempSayi+" Sayinin Basamak Sayilarinin Toplami: "+toplam);
    }
}
