import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
       /**
        ALAN CEVRE BULMA

        double pi=3.14,yariCap,alan,cevre;
        Scanner scan=new Scanner(System.in);

        System.out.print("YarıÇapı Girin:");
        yariCap= scan.nextDouble();

        cevre=2*pi*yariCap;
        System.out.println("Çevre: "+cevre);

        alan=pi*yariCap*yariCap;
        System.out.println("Alan: "+alan);

        */

       //DAİRE DİLİMİNİN ALANI
        double pi=3.14,yariCap,alan,merkezAci;
        Scanner scan=new Scanner(System.in);

        System.out.print("Yarı Çapı Girin: ");
        yariCap= scan.nextDouble();

        System.out.print("Merkez Açı Ölçüsü:");
        merkezAci= scan.nextDouble();

        alan=(pi*yariCap*yariCap*merkezAci)/360;
        System.out.println("Daire Diliminin Alanı: "+alan);
    }
}
