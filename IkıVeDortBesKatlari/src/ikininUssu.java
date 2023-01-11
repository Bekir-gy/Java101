import java.util.Scanner;

public class ikininUssu {
    public static void main(String[] args) {
        int sayi;
        Scanner scan= new Scanner(System.in);

        System.out.print("Sayiyi Giriniz:");
        sayi=scan.nextInt();
        for (int i=1;i<=sayi;i*=2){
            System.out.println("2nin Usleri: "+i);



        }
    }
}
