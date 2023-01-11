import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args) {
        int year,sonuc;

        Scanner scan= new Scanner(System.in);

        System.out.print("Yıl Giriniz:");
        year=scan.nextInt();
        sonuc=year%4;

        if (year%100==0){
            if (year%400==0){
                System.out.println(year+" Yılı Artık Yıldır");
            }else {
                System.out.println(year+" Yılı Artık Yıl Değildir.");
            }
        }else{
            if (year%4==0)
                System.out.println(year+" Yılı Artık Yıldır");
            else
                System.out.println(year+" Yılı Artık Yıl Değildir");

        }

    }
}
