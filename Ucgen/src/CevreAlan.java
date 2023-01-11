import java.util.Scanner;

public class CevreAlan {
    public static void main(String[] args) {
        /*double kenar1,kenar2,kenar3;
        Scanner scan=new Scanner(System.in);

        System.out.print("BirinciKenar:");
        kenar1=scan.nextInt();
        System.out.print("İkinci Kenar:");
        kenar2=scan.nextInt();

        kenar3=Math.sqrt ((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs Kenarı: "+kenar3);
        */

        //Alan Cevere
        double alan,cevre,kenar1,kenar2,kenar3,u;
        Scanner girdi= new Scanner(System.in);

        System.out.print("1.Kenar: ");
        kenar1=girdi.nextDouble();
        System.out.print("2.Kenar: ");
        kenar2=girdi.nextDouble();
        System.out.print("3.Kenar: ");
        kenar3= girdi.nextDouble();

        u=(kenar1+kenar2+kenar3)/2;

        cevre=2*u;
        System.out.println("Çevresi: "+cevre);

        alan=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        System.out.println("ALANI: "+Math.sqrt(alan));
    }
}
