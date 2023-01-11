import java.util.Scanner;

public class Tkrr1 {
    public static void main(String[] args) {
        int miktar,sayi,min,max;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Adet Sayi Gireceksiniz:");
        miktar=scan.nextInt();
        System.out.print("Sayiyi Girin:");
        sayi=scan.nextInt();
        min=sayi;
        max=sayi;
        for (int i=1;i<miktar;i++){
            System.out.print("Sayiyi Girin:");
            sayi=scan.nextInt();
            if (max>sayi){
                max=sayi;
            }
            if (min<sayi){
                min=sayi;
            }
        }
        System.out.println("En Büyük Sayi:"+max);
        System.out.println("En Küçük Sayi:"+min);
    }
}