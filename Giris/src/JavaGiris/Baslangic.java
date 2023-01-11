package JavaGiris;

public class Baslangic {
    public static void main(String[] args) {
        //tek yorum satırı
        /*
        * birden fazla yorum satırı
        * başka bir yorum satırı
        *  */
        /**
         * @author bgy
         */

        System.out.println("hello world");
        System.out.println("çift tırnak \"denemesi\" ");
        System.out.println("tek tırnak \'denemesi\' ");

        int numberOne=5,numbertwo=2;
        int number3=numberOne+numbertwo;
        System.out.println("sayıların toplamı:"+(numberOne+numbertwo));
        System.out.println(number3);

        int kisaKenar=8,uzunKenar=7,alan,cevre;
        alan=kisaKenar*uzunKenar;
        cevre=2*(kisaKenar+uzunKenar);
        System.out.println("alan: "+alan+ "\ncevre: "+cevre);

        int a=5,b=7,c=1;
        boolean kosul1=a<b;
        boolean kosul2=b>c;
        boolean sonuc= a>b || b>c;
        boolean sonuc2= kosul1 && kosul2;

        String str= sonuc2 ? "dogru":"yanlis";
        System.out.println(sonuc);
        System.out.println(sonuc2);
        System.out.println(str);
    }
}
