import java.util.Scanner;

public class ATMswitch {
    public static void main(String[] args) {
        String userName,Password;
        int right=3,secim;
        double balance=1500;
        Scanner scan=new Scanner(System.in);

        while (right>0){
            System.out.print("Kullanıcı Adınız:");
            userName=scan.nextLine();
            System.out.print("Parolanız:");
            Password=scan.nextLine();
            if (userName.equals("patika") && Password.equals("dev123")){
                System.out.println("Başarılı Giriş... Bankamıza Hoşgeldiniz...");
               do {
                System.out.print("1-Para Yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgulama\n" +
                        "4-ÇIKIŞ\n" +
                        "Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
                secim=scan.nextInt();



                    switch (secim) {
                        case 1:
                            System.out.print("Yatırılacak Tutarı Giriniz:");
                            int tutar = scan.nextInt();
                            balance += tutar;
                            continue;
                        case 2:
                            System.out.print("Çekilecek Tutarı Giriniz:");
                            tutar = scan.nextInt();
                            if (tutar > balance) {
                                System.out.println("Bakiyenizde Yeterli Tutar Yok...");
                            } else {
                                balance -= tutar;
                            }
                            continue;
                        case 3:
                            System.out.println("Bakiyeniz:" + balance);
                            continue;
                       case 4:
                            System.out.println("Çıkış Yapılıyor... Tekrar Bekleriz.");
                            break;
                        default:
                            System.out.println("Yanlış Seçim Yaptınız...");

                    }
                }while (secim!=4);
                //System.out.println("Çıkış Yapılıyor Tekrar Bekleriz...");
                break;


            }else {
                right--;
                if (right>0){
                    System.out.println("Hatalı Giriş Yaptınız.. Tekrar Deneyiniz Kalan Hakkınız:"+right);
                }else {
                    System.out.println("Kullanım Hakkınız Doldu." +
                            "Kartınız Bloke Oldu... Banka İle İletşime Geçiniz...");
                }
            }
        }
    }
}
