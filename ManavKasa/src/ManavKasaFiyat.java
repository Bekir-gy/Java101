import java.util.Scanner;

public class ManavKasaFiyat {
    public static void main(String[] args) {
        double armutKg=2.14,elmaKg=3.67,domatesKg=1.11,muzKg=0.95,patlicanKg=5,tutar;
        double armut,elma,domates,muz,patlican;

        Scanner scan=new Scanner(System.in);

        System.out.print("Armut Kaç Kg:");
        armut=scan.nextDouble();
        armut=armutKg*armut;

        System.out.print("Elma Kaç Kg:");
        elma=scan.nextDouble();
        elma=elmaKg*elma;

        System.out.print("Domates Kaç Kg:");
        domates=scan.nextDouble();
        domates=domatesKg*domates;

        System.out.print("Muz Kaç Kg:");
        muz=scan.nextDouble();
        muz=muzKg*muz;

        System.out.print("Patlıcan Kaç Kg:");
        patlican=scan.nextDouble();
        patlican=patlicanKg*patlican;

        tutar=armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar: "+tutar);
    }
}
