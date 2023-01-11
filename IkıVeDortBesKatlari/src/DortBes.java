import java.util.Scanner;

public class DortBes {
    public static void main(String[] args) {
        int sayi;
        Scanner scan=new Scanner(System.in);

        System.out.print("Sayiyi Giriniz:");
        sayi=scan.nextInt();

        for (int i=1;i<=sayi;i*=4){
            System.out.println("4ün Usleri:"+i);
        }
        System.out.println();
        for (int i=1;i<=sayi;i*=5){
            System.out.println("5in Usleri:"+i);
        }
    }
}
