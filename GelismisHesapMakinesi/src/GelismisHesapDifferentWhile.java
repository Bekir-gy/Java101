import java.util.Scanner;

public class GelismisHesapDifferentWhile {
    static void plus(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Adet Sayi Gireceksiniz:");
        int miktar=scan.nextInt();
        int result=0;
        for (int i=1;i<=miktar;i++){
            System.out.print(i+".Sayiyi Giriniz:");
            int sayi1=scan.nextInt();
            result+=sayi1;
            System.out.println("Toplama sonucu:"+(result));
        }
    }
    static void minus(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Adet Sayi Gireceksiniz:");
        int miktar=scan.nextInt();
        int result=0;
        for (int i=1;i<=miktar;i++){
            System.out.print(i+".sayiyi Girin:");
            int sayi1=scan.nextInt();
            if (i==1) {
                result += sayi1;
            }else {
                result-=sayi1;
                System.out.println("Cikarma Sonucu:"+(result));
            }
        }
    }
    static void times(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Adet Sayi Gireceksiniz:");
        int miktar=scan.nextInt();
        int result=1;
        for (int i=1;i<=miktar;i++){
            System.out.print(i+".Sayiyi Giriniz:");
            int sayi1=scan.nextInt();
            if (sayi1==0) {
                result = 0;
                break;
            }
            result*=sayi1;
        }
        System.out.println("Çarpma İşleminin Sonucu:"+(result));

    }
    static void divided(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Adet Sayi Gireceksiniz:");
        int miktar=scan.nextInt();
        double result=0;
        for (int i=1;i<=miktar;i++){
            System.out.print(i+".Sayiyi Girin:");
            double sayi1=scan.nextInt();
            if (i!=1 && sayi1==0){
                System.out.println("Payda 0 a bölünmez");
                i--;
                continue;
            }
            else if (i==1){
                result+=sayi1;
                continue;
            }
            result/=sayi1;

        }
        System.out.println("Bölme Sonucu:"+(result));
    }
    static void power(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Tabanı Girin:");
        int taban=scan.nextInt();
        System.out.print("Ussu Girin:");
        int us=scan.nextInt();
        int result=1;
        for (int i=1;i<=us;i++){
            result*=taban;
        }
        System.out.println("İslem Sonucu:"+result);
    }
    static void Fact() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktöriyeli Alınacak Sayi:");
        int sayi=scan.nextInt();
        int result=1;
        for (int i=1;i<=sayi;i++){
            result*=i;
        }
        System.out.println("Faktöriyel Sonucu:"+result);
    }
    static void mod(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Modu Alınacak Sayı:");
        int sayi1=scan.nextInt();
        System.out.print("Kaça Göre Modu Alınacak:");
        int modAl=scan.nextInt();
        System.out.println("Mod Sonucu:"+(sayi1%modAl));
    }
    static void Dikdortgen(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Uzun Kenar:");
        int uzunKenar=scan.nextInt();
        System.out.print("Kısa Kenar:");
        int kisaKenar=scan.nextInt();
        int cevre=2*(uzunKenar+kisaKenar);
        int alan=uzunKenar*kisaKenar;
        System.out.println("Dikdörtgenin Çevresi:"+cevre+"\nDikdörtgenin Alani:"+alan);
    }


    public static void main(String[] args) {
        int islem;
        Scanner scan=new Scanner(System.in);
        String secim="1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme\n" +
                "5-Us Alma\n" +
                "6-Faktöriyel\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgenin Alan Ve Çevresi:\n" +
                "0-Çıkış\n" +
                "Hangi İşlemi Yapmak İstiyorsunuz:";

        while (true) {
            System.out.print(secim);
            islem=scan.nextInt();
            if (islem==0)
                break;
            switch (islem){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    Fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    Dikdortgen();
                    break;
                /*case 0:
                    break;*/
                default:
                    System.out.println("Hatalı İslem Secimi");
            }
        }
        System.out.println("Güle Güle");
    }
}
