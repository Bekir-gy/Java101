import java.util.Scanner;

public class DortKati {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.print("Sayi Girin:");
            sayi=scan.nextInt();
            if (sayi%4==0){
                toplam+=sayi;
            }

        }while(sayi%2==0);

        System.out.println("Girilen Değerlerden Çift ve 4 sayisina Tam Bölünenlerin TOPLAMI:"+toplam);

    }
}
