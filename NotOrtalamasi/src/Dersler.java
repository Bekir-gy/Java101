import java.util.Scanner;

public class Dersler {
    public static void main(String[] args) {
        // Dersler
        int mat,fizik,kimya,turkce,tarih,muzik;

        //notlari alma
        Scanner scan=new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat= scan.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik=scan.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya= scan.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce=scan.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih= scan.nextInt();


        System.out.print("Muzik Notunuz:");
        muzik= scan.nextInt();

        //ortalama
        double ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız:"+ortalama);
        // Kontrol
        boolean durum=ortalama>=60 ;
        String sonuc= durum ? "Geçti": "KALDI";
        System.out.println(sonuc);

    }

}
