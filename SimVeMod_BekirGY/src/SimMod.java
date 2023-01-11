/**
 * @author Bekir Göktuğ Yeğin
 * 50180076102 simülasyon ve modelleme ödevi
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import  jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.Number;

public class SimMod {
    public static void main(String[] args) throws Exception {
        int [] mathArray= null;
        File f=new File("src\\veri.xls"); //DOSYA YOLU PROJE İLE AYNI KLASÖR ALTINDA
        Workbook Wb=Workbook.getWorkbook(f); // ÇEKTİĞİM DOSYAYI ÇALIŞMA KİTABI OLARAK ALIYORUM

        Sheet sh=Wb.getSheet(0); //EXCELDEN ALDIĞIM ÇALIŞMA KİTABININ SAYFASINI ÇEKİYORUM
        mathArray = new int[sh.getRows()];

        int row=sh.getRows(); // SATIRDAK, DEĞERLERİ ALIYORUM
        int col= sh.getColumns(); // SÜTUNDAKİ DEĞERLERİ ALIYORUM
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                Cell c=sh.getCell(j,i); // HÜCREDEKİ VERİYİ ALIYORUM
                mathArray[i] = Integer.parseInt(c.getContents()); // HÜCREDEKİ VERİLERİ İNTEGER DEĞERİNE ÇEVİRİYORUM
               // System.out.print(c.getContents());
            }
            //System.out.println("   ");
        }

        int total=0;
        for (int i=0;i< mathArray.length;i++){

            total=mathArray[i]+total;  // BURADA EXCEL TABLOSUNDAKİ DEĞERLERİN TOPLAMINA BAKIYORUM BU İSTENİLMESEDE
        }
        System.out.println(Arrays.toString(mathArray)); // EXCEL TABLOSUNDAN ÇEKLEN VERİLERİ YAZDIRIYORUM
        System.out.println(total);

        int sayac3=0,sayac4=0,sayac5=0,sayac6=0;
        for (int i=0;i< mathArray.length;i++){ // EXCEL TABLOSUNDA DEĞERLERİ AYRIŞTIRMA
            if (mathArray[i]==3)
                sayac3++;
            else if (mathArray[i]==4)
                sayac4++;
            else if (mathArray[i]==5)
                sayac5++;
            else
                sayac6++;
        }
        // TABLODA HANGİ DEĞERİN KAÇ KERE TEKRAR ETTİĞİNİ FREKANSI BULMA
        System.out.println("----------FREKANS DEĞERLERİ-------------\n" +
                "3'ün adet sayisi-->> "+sayac3+"\n" +
                "4'ün adet sayisi-->> "+sayac4+"\n" +
                "5'in adet sayisi-->> "+sayac5+"\n" +
                "6'nin adet sayisi-->> "+sayac6+"\n" +
                "TOPLAM= "+(sayac3+sayac4+sayac5+sayac6)+"\n" +
                "--------------------------------------------");

        double olasilik3,olasilik4,olasilik5,olasilik6; //OLASILIK HESABI
        olasilik3=sayac3/48.0;
        olasilik4=sayac4/48.0;
        olasilik5=sayac5/48.0;
        olasilik6=sayac6/48.0;
        System.out.println("--------OLASILIK=FREKANS/TOPLAM FREKANS-------------\n" +
                "3 için olasılık->> "+olasilik3+"\n" +
                "4 için olasılık->> "+olasilik4+"\n" +
                "5 için olasılık->> "+olasilik5+"\n" +
                "6 için olasılık->> "+olasilik6+"\n" +
                "TOPLAM= "+(olasilik3+olasilik4+olasilik5+olasilik6)+"\n" +
                "--------------------------------------------------------------");

        double kOlasilik3=0,kOlasilik4,kOlasilik5,kOlasilik6; // KÜMÜLATİF OLASILIK HESABI
        kOlasilik4=kOlasilik3+olasilik3;
        kOlasilik5=kOlasilik4+olasilik4;
        kOlasilik6=kOlasilik5+olasilik5;
        System.out.println("-------------KÜMÜLATİF OLASILIK-------------\n" +
                "3 için Kümülatif Olasılık->> "+kOlasilik3+"\n" +
                "4 için Kümülatif Olasılık->> "+kOlasilik4+"\n" +
                "5 için Kümülatif Olasılık->> "+kOlasilik5+"\n" +
                "6 için Kümülatif Olasılık->> "+kOlasilik6+"\n" +
                "TOPLAM= "+(kOlasilik6+olasilik6)+"\n" +
                "-----------------------------------------------------------");

        int [] mathArray2=new int[12000]; // 12000 ADET RASTEGELE SAYI ÜRETİMİ YAPILIYOR 0-1 ARASINDA
        for (int i=0;i<1;i++){ //12*1000 12000 VERİ OLUŞUR
            for (int j=0;j< mathArray2.length;j++){
                double rnd=Math.random();
                //System.out.println(rnd);
                if (/*rnd>=kOlasilik3 &&*/ rnd<kOlasilik4) //OLUŞAN DEĞERİN HANGİ KÜMÜLATİF OLASILIK ARALIĞINA VE ONA KARŞILIK GELEN HANGİ ARALIĞA GİRDİĞİNİ BULUNUR
                    mathArray2[j]=3;
                else if (rnd>=kOlasilik4 && rnd<kOlasilik5)
                    mathArray2[j]=4;
                else if (rnd>=kOlasilik5 && rnd<kOlasilik6)
                    mathArray2[j]=5;
                else
                    mathArray2[j]=6;
            }



        }
        int sayac33=0,sayac44=0,sayac55=0,sayac66=0; // İSTENİLEN 12 AYA AİT YENİ FREKANS DEĞERLERİNİN SAYIMI
        for (int i=0;i< mathArray2.length;i++){
            if (mathArray2[i]==3)
                sayac33++;
            else if (mathArray2[i]==4)
                sayac44++;
            else if (mathArray2[i]==5)
                sayac55++;
            else
                sayac66++;

        }
        // İSTENİLEN 12 AYA AİT YENİ FREKANS DEĞERLERİ
        System.out.println("---------- YENİ OLUŞAN FREKANS DEĞERLERİ-------------\n" +
                "3'ün adet sayisi-->> "+sayac33+"\n" +
                "4'ün adet sayisi-->> "+sayac44+"\n" +
                "5'in adet sayisi-->> "+sayac55+"\n" +
                "6'nin adet sayisi-->> "+sayac66+"\n" +
                "TOPLAM= "+(sayac33+sayac44+sayac55+sayac66)+"\n" +
                "--------------------------------------------");


        /*double RandomNumber = Math.random();
        System.out.println(RandomNumber);*/
        System.out.println();

        System.out.println("Doğrusal Eşlik Yöntemi ile Rassal Sayı Üretme\n" +
                "-------------------------------------------\n" +
                "Lütfen x0 Başlangıç değeri, a Sabit çarpan değeri, c Artış değeri giriniz:\n" +
                "NOT: 100 ADET İSTENDİĞİ İÇİN MOD DEĞERİ 100 OLARAK ALINMIŞTIR.");
        Scanner scan=new Scanner(System.in);
        System.out.print("x0 Değeri giriniz:");
        int x0=scan.nextInt();
        System.out.print("a Sabit Çarpan Değeri Giriniz:");
        int a=scan.nextInt();
        System.out.print("c Artış Değeri Giriniz:");
        int c=scan.nextInt();
        System.out.println("U0 Değeri= "+x0/100.0);
        dEslik(a,c,x0);

        System.out.println();
        System.out.println("------------------- ORTAK KARE YÖNTEMİ İLE RASSAL SAYI ÜRETİMİ------------------");
        System.out.print("Lütfen Ortak Kare Metodu İçin Sayı Giriniz:");
        int ortakKare=scan.nextInt();
        OrtakKare(ortakKare);

    }

   static void dEslik(int a,int c,int x0) { //DOĞRUSAL EŞLİK YÖNTEMİ

       double u = 0;
       for (int i = 1; i < 100; i++) {
           /*double sonuc=x0%100;
            System.out.println("U0="+sonuc);*/
           x0 = (a * x0 + c) % 100; //MOD DEĞERİ 100 OLACAKTIR 100 ADET İSTENDİĞİ İÇİN
           u = x0 / 100.0; //ÇIKAN DEĞER BU KEZ MOD DEĞERİNE BÖLÜNÜR
           System.out.println("U"+i+" Değeri= "+u);

       }

   }
   static void OrtakKare(int x){ //ORTAK KARE YÖNTEMİ
        for (int i=1;i<=100;i++){
            double sonuc=x*x;
            double mod=sonuc%1000000;
            x= (int) (mod/100); // ORTADAKİ 4 BASAMAĞI ALIYORUM
            //System.out.println(x); KARIŞIK GÖZÜKMEMESİ İÇİN ORTADAKİ 4 BASAMAĞI YAZDIRMIYORUM ZATEN 10.000 E BÖLÜNMÜŞ HALİNDE BELLİ OLUYOR

            double y=x/10000.0; //ONDALIKLI SAYIYA DÖNÜŞTÜRÜYORUM BUNUN İÇİN 10.000 E BÖLÜYORUM KURALDA OLDUĞU GİBİ
            System.out.println("U"+i+" Değeri= "+y);
            System.out.println();
        }
   }


}
