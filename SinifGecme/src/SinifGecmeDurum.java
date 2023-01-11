import java.util.Scanner;

public class SinifGecmeDurum {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,gecerliNot=0,dersSayac=0;
        double ortalama;

        Scanner scan= new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat=scan.nextInt();
        if (mat>=0 && mat<=100) {
            gecerliNot += mat;
            ++dersSayac;
        }

        System.out.print("Fizik Notunuz:");
        fizik=scan.nextInt();
        if (fizik>=0 && fizik<=100) {
            gecerliNot += fizik;
            ++dersSayac;
        }

        System.out.print("Türkçe Notunuz:");
        turkce=scan.nextInt();
        if (turkce>=0 && turkce<=100) {
            gecerliNot += turkce;
            ++dersSayac;
        }

        System.out.print("Kimya Notunuz:");
        kimya=scan.nextInt();
        if (kimya>=0 && kimya<=100) {
            gecerliNot += kimya;
            ++dersSayac;
        }

        System.out.print("Müzik Notunuz:");
        muzik=scan.nextInt();
        if (muzik>=0 && muzik<=100){
            gecerliNot+=muzik;
            ++dersSayac;
        }

        // eger 0 İLE 100 arasında olmayan derslerin sayısı bölüme dahil değilse burası
        ortalama=gecerliNot/dersSayac;

        /**
         * eger 0 İLE 100 arasında olmayan derslerin sayısı bölüme dahilse burası
         ortalama=gecerliNot/5;

         */


        /* şartlar olmadan klasik hesaplama
        ortalama=(mat+fizik+turkce+kimya+muzik)/5;
         */

        if (ortalama<55){
            System.out.println("Geçemediniz Ortalamanız: "+ortalama);
        }else {
            System.out.println("Geçtiniz Ortalamanız: "+ ortalama);
        }
    }
}
