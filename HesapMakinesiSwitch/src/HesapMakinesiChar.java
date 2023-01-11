import java.util.Scanner;

public class HesapMakinesiChar {
    public static void main(String[] args) {
        int n1,n2;
        char opertor;

        Scanner scan=new Scanner(System.in);

        System.out.print("1.sayiyi Giriniz:");
        n1=scan.nextInt();

        System.out.print("2.sayiyi Giriniz:");
        n2=scan.nextInt();

        System.out.print("Operatörü Seçin: (+ - * /)\nSeçiminiz:");
        opertor=scan.next().charAt(0);

        switch (opertor){
            case '+':
                System.out.println("İslemin Sonucu:"+(n1+n2));
                break;
            case '-':
                System.out.println("İslemin Sonucu:"+(n1-n2));
                break;
            case '*':
                System.out.println("İslemin Sonucu:"+(n1*n2));
                break;
            case '/':
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
