import java.util.Scanner;

public class ATMif {
    public static void main(String[] args) {
        String userName,Password;
        double balance=1500;
        int right=3,islem;
        Scanner scan=new Scanner(System.in);

        while (right>0){
            System.out.print("Kullanıcı Adınız:");
            userName= scan.nextLine();
            System.out.print("Parolanızı Giriniz:");
            Password=scan.nextLine();
            if (userName.equals("patika") && Password.equals("dev123")){
                System.out.println("Giriş Başarılı. Bankamıza HoşGeldiniz...");

                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-ÇIKIŞ");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
                    islem=scan.nextInt();
                    if (islem==1){
                        System.out.print("Yatacak tutar ne kadar: ");
                        int tutar=scan.nextInt();
                        balance+=tutar;
                    }else if (islem ==2){
                        System.out.print("Ne Kadar tutar Çekmek İstiyorsunuz:");
                        int tutar=scan.nextInt();
                        if (tutar>balance){
                            System.out.println("Bakiyenizde Yeterli Miktar Yok.");
                        }else {
                            balance-=tutar;
                        }
                    }else if (islem==3){
                        System.out.println("Bakiyeniz:"+balance);
                    }
                }while (islem!=4);
                System.out.println("Sistemden Çıkıldı... Tekrar Bekleriz...");
                break;



            }else {
                System.out.println("Kullanıcı Adı Veya Parola Hatalı");
                right--;
                if (right>0){
                    System.out.println("Tekrar Deneyiniz ... kalan hak:"+ right);
                }else {
                    System.out.println("Kullanım Hakkkınız Doldu." +
                            "Kartınız Bloke Edilmiştir Banka İle İletişime Geçiniz.");
                }
            }
        }

    }
}
