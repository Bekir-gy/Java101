import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username,password,password2;
        int secim;

        Scanner scan=new Scanner(System.in);

        System.out.print("Kullanici Adinizi Giriniz:");
        username=scan.nextLine();

        System.out.print("Parolanizi Giriniz:");
        password=scan.nextLine();

        if (username.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş Başarılı...");
        }
        else if(!username.equals("patika")) {
            System.out.println("Kullanici Adi Hatali");
        }
        else if(!password.equals("java123")){
            System.out.print("Parola Hatalı... Şifrenizi Sıfırlamak ister misiniz?\nEvet ise 1'e\nHayır ise 2'ye Basın\nSeciminiz:");
            secim=scan.nextInt();
            scan.nextLine();
            if (secim==1) {
                System.out.print("Yeni Parolanızı Girin:");
                password2 = scan.nextLine();
                if (password2.equals("java123") || password2.equals(password)) {
                    System.out.println("Parolanız Önceki Şifre ve Yanlış Girilen Şifre ile Aynı Olamaz...");
                }
                else {
                    System.out.println("Şifre Oluşturuldu...");
                }
            }
            else if(secim==2) {

                System.out.println("Şifre Oluşturulmaktan Vazgeçildi Programdan Çıkılıyor...");
            }
            else {
                    System.out.println("Geçerli Bir Seçim Yapılmadı...");
            }
        }
    }
}
