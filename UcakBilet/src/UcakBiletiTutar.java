import java.util.Scanner;

public class UcakBiletiTutar {
    public static void main(String[] args) {
        int yas,mesafe,BiletTuru;
        double yasIndirimi,BiletIndirimi,NormalTutar,Tutar,indirimliTutar;
        boolean  isError=false;
        Scanner scan=new Scanner(System.in);

        System.out.print("Mesafeyi Km Türünden Giriniz:");
        mesafe=scan.nextInt();

        System.out.print("Yaşınızı Giriniz:");
        yas=scan.nextInt();

        System.out.print("Bilet Türünü Seçiniz:\n 1-Tek Yön\n 2-Gidiş Dönüş\nSeçiminiz:");
        BiletTuru=scan.nextInt();

        switch (BiletTuru){
            case 1:
               if (mesafe>0) {
                   if (yas >= 1 && yas < 12) {
                       NormalTutar = mesafe * 0.10;
                       yasIndirimi = NormalTutar * 0.50;
                       indirimliTutar = NormalTutar - yasIndirimi;
                       System.out.println("Toplam Tutar:" + indirimliTutar);

                   } else if (yas >= 12 && yas <= 24) {
                       NormalTutar = mesafe * 0.10;
                       yasIndirimi = NormalTutar * 0.10;
                       indirimliTutar = NormalTutar - yasIndirimi;
                       System.out.println("Toplam Tutar:" + indirimliTutar);
                   } else if (yas > 65) {
                       NormalTutar = mesafe * 0.10;
                       yasIndirimi = NormalTutar * 0.30;
                       indirimliTutar = NormalTutar - yasIndirimi;
                       System.out.println("Toplam Tutar:" + indirimliTutar);
                   }else if (yas>24){
                       NormalTutar=mesafe*0.10;
                       System.out.println("Toplam Tutar:"+ NormalTutar);
                   } else {
                       isError = true;
                   }
               }else {
                   isError=true;
               }
               break;
            case 2:
                if (mesafe>0){
                    if (yas>=1 && yas<12){
                        NormalTutar=mesafe*0.10;
                        yasIndirimi=NormalTutar*0.50;
                        indirimliTutar=NormalTutar-yasIndirimi;
                        BiletIndirimi=indirimliTutar*0.20;
                        Tutar=(indirimliTutar-BiletIndirimi)*2;
                        System.out.println("Toplam Tutar:"+Tutar);
                    }else if (yas>=12 && yas<=24){
                        NormalTutar=mesafe*0.10;
                        yasIndirimi=NormalTutar*0.10;
                        indirimliTutar=NormalTutar-yasIndirimi;
                        BiletIndirimi=indirimliTutar*0.20;
                        Tutar=(indirimliTutar-BiletIndirimi)*2;
                        System.out.println("Toplam Tutar:"+Tutar);
                    }else if (yas>65){
                        NormalTutar=mesafe*0.10;
                        yasIndirimi=NormalTutar*0.30;
                        indirimliTutar=NormalTutar-yasIndirimi;
                        BiletIndirimi=indirimliTutar*0.20;
                        Tutar=(indirimliTutar-BiletIndirimi)*2;
                        System.out.println("Toplam Tutar:"+Tutar);
                    }else if (yas>24){
                        NormalTutar=mesafe*0.10;
                        BiletIndirimi=NormalTutar*0.20;
                        Tutar=(NormalTutar-BiletIndirimi)*2;
                        System.out.println("Toplam Tutar:"+Tutar);
                    }else {
                        isError=true;
                    }

                }else {
                    isError=true;
                }
                break;
            default:
                isError=true;
        }

        if (isError==true){
            System.out.println("Hatalı Giriş Yaptınız..");
        }



    }
}


















/**

 if (mesafe>0 || yas>0 || BiletTuru==1 || BiletTuru==2){
 if (BiletTuru==1){
 if ()
 }

 }else {
 System.out.println("Hatalı Değerler Girdiniz...");
 }

 */
