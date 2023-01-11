import java.util.Scanner;

public class UcDortBolunen {
    public static void main(String[] args) {
        int sayi,toplam=0,sayac=0;
        double ortalama;

        Scanner scan=new Scanner(System.in);

        System.out.print("Sayiyi Girin:");
        sayi=scan.nextInt();

        for (int i=0; i<=sayi; i++){
            if (i%3==0 && i%4==0){
                toplam+=i;
                sayac++;

            }
        }
        ortalama=toplam/sayac;
        System.out.println("3 ve 4 tam bölünenlerin ortalaması:"+ortalama);
    }
}
