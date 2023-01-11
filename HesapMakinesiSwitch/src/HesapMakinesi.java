import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,operator;


        Scanner scan=new Scanner(System.in);

        System.out.print("1.sayiyi Giriniz:");
        n1=scan.nextInt();

        System.out.print("2.sayiyi Giriniz:");
        n2=scan.nextInt();

        System.out.print("Operatörü Seçin:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz:");
        operator=scan.nextInt();

        switch (operator){
            case 1:
                System.out.println("İslemin Sonucu:"+(n1+n2));
                break;
            case 2:
                System.out.println("İslemin Sonucu:"+(n1-n2));
                break;
            case 3:
                System.out.println("İslemin Sonucu:"+(n1*n2));
                break;
            case 4:
                if (n2!=0){
                    System.out.println("İşlemin Sonucu:"+(n1/n2));
                }else {
                    System.out.println("Sayı 0'a Bölünemez.");
                }
                break;
            default:
                System.out.println("Hatalı İşlem Seçimi.");

        }
    }


}
