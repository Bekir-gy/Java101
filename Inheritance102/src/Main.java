public class Main {


    public static void main(String[] args) {
      // abstraction olduğu için nesne üretilmez  Calisan c1=new Calisan("calisan1","484648","calisan1.com");




      //  Akademisyen a1=new Akademisyen("akedemisyen 1","05887777","akdmail.com","BOLUM1","PROF");
       // a1.giris();
        //a1.derseGir();

        Asistan asistan1=new Asistan("Asistan1","0254548","asistan.com","bolumasistan","asistanunvan","20.00-21.00");
        //override edilmemişi metodun yani üst sınıftaki asıl sahip olduğu ilk yazılmışı
        asistan1.quizYap();
        asistan1.derseGir("15.00");
        asistan1.yemekhane();
        System.out.println(asistan1.getOfisSaati());

        LabAsistani lab1=new LabAsistani("Labasistani1", "0548484","lab.com","labBolum","labAsistan","18.00-19.00");
        lab1.LablaraGir();
        //override edilmişi metodun
        lab1.quizYap();

        OgretimGorevlisi o1=new OgretimGorevlisi("INSTRUCTOR1","058448","OG.COM","bolum2","arstrma","154");
        o1.giris();
        o1.derseGir("10.00");
        System.out.println(o1.getKapiNo());
        o1.SenatoToplantisi();
        o1.SinavYap();

        System.out.println("-----------------------------------");
        /*  asbtraction sınıf olduğu için nesne üretilmez
        Memur m1=new Memur("memur1","483486348","memur.com","bilgi islem","09-12");
        m1.calis();
        System.out.println(m1.getAdSoyad());*/

        BilgiIslem bilgi1=new BilgiIslem("Bilgiİslemİsim","878787","bilgi.com","bilgiislem","09.00-12.00","networkkurulum");
        bilgi1.NetworkKurulum();
        System.out.println(bilgi1.getDepartman());
        // memur sınıfında yani üst sınıftaki veya extends edilen sınıftaki sahip olduğu metodun overloading edilmemişi
        bilgi1.calis();
        // overloading bilgiislem sınıfında  yapılmış overloading yani altsınıfta yapılan overloading
        bilgi1.calis(bilgi1.getMail());
        //overloading memur sınıfında yapılan overloading yani asıl sahibi olan veya extends edilen üst sınıfta yapılan overloading
        bilgi1.calis(bilgi1.getGorev(), bilgi1.getTelefon());
        bilgi1.calisAbstraction("11.00");

        GuvenlikGorevlisi guvenlikGorevlisi=new GuvenlikGorevlisi("GuvenlikIsimi","85412154874","guvenlik.com","güvenlikdepartman","15.00-19.00","üst düzey");
        guvenlikGorevlisi.Nobet();
        guvenlikGorevlisi.calisAbstraction("12.00");
        System.out.println("-------------------------------------");

        //bu da poliymorphism
        //Calisan o1=new OgretimGorevlisi("INSTRUCTOR1","058448","OG.COM","bolum2","arstrma","154");

        //polymorphism
        Calisan [] loginUser={/*c1*/ /*a1*/o1/*m1*/};
        Calisan.giriss(loginUser);


    }
}
