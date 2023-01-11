import java.util.Scanner;

public class HesapMakinesiInt {
    public static void main(String[] args) {
        int n1,n2,islem;
        Scanner scan= new Scanner(System.in);

        System.out.print("1.sayıyı giriniz: ");
        n1=scan.nextInt();

        System.out.print("2.sayıyı giriniz: ");
        n2=scan.nextInt();

        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme \nSECIMINIZ:");
        islem=scan.nextInt();

        if (islem ==1){
            System.out.println("İslemin Sonucu:"+(n1+n2));
        }
        else if (islem ==2){
            System.out.println("İslemin Sonucu:"+(n1-n2));
        }
        else if(islem==3){
            System.out.println("İslemin Sonucu:"+(n1*n2));
        }
        else if(islem == 4){
            if(n2!=0){
                System.out.println("İslemin Sonucu:"+(n1/n2));
            }else {
                System.out.println("Sayı 0'a Bölünemez.");
            }
        }
        else {
            System.out.println("Hatalı islemm Secimi");
        }
    }
}
