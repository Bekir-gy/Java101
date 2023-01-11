import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2;
        char islem;
        Scanner scan=new Scanner(System.in);

        System.out.print("İslem Türünü Giriniz (+ - * /):");
        islem=scan.next().charAt(0);

        System.out.print("1.Sayıyı Giriniz:");
        n1=scan.nextInt();

        System.out.print("2.Sayıyı Giriniz:");
        n2=scan.nextInt();



        if (islem == '+'){
            System.out.println("İslem Sonucu: "+(n1+n2));

        }
        else if (islem == '-'){
            System.out.println("İslem Sonucu: "+(n1-n2));
        }
        else if (islem == '*'){
            System.out.println("İslem Sonucu: "+(n1*n2));
        }
        else if (islem == '/'){
            if (n2!=0) {
                System.out.println("İslem Sonucu: " + (n1 / n2));
            }else{
                System.out.println("Sayı 0'a bölünemez.");
            }
        }
        else {
            System.out.println("Hatalı İslem Secimi");
        }

    }
}
