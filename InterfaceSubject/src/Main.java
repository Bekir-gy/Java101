import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Tutar Giriniz:");
        double price=scan.nextDouble();

        System.out.print("ENTER CARD NUMBER:");
        String cardNumber=scan.next();

        System.out.print("Enter Date:");
        String Date=scan.next();

        System.out.print("ENTER YOUR CVC:");
        String cvc=scan.next();

        System.out.println("1-A BANKASI\n" +
                "2-B BANKASI\n" +
                "3-C BANKASI");
        System.out.print("Banka SEÇİNİZ:");
        int secim=scan.nextInt();

        switch (secim){
            case 1:
                ABankasi aBankasi=new ABankasi("ABANKASİ","12541154","75112");
                /* interface olmasa burada farklı isimde metotlar yaziyordu Bbankasindan
                abstraction ile de aynı isimde metotlar kullanılabilir ama burada interface konusu içni yapıldı
                aBankasi.paid(price,cardNumber,Date,cvc);

                aBankasi.connect();*/

                aBankasi.connect("1.0.1.1");
                aBankasi.payment(price,cardNumber,Date,cvc);
                break;
            case 2:
                BBankasi bBankasi=new BBankasi("B bANKASİ", "8521598","854845485548");
                /* interface olmasa burada farklı isimde metotlar yaziyordu Abankasindan
                abstraction ile de aynı isimde metotlar kullanılabilir ama burada interface konusu için yapıldı
                bBankasi.con("giris");
                bBankasi.payment(price);*/

                bBankasi.connect("2.5.0.1");
                bBankasi.payment(price,cardNumber,Date,cvc);
                break;
            default:
                System.out.println("Geçerli Seçim Yapınız:");
        }
    }
}
