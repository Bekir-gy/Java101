import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        int password;
        boolean askPassword=true;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.print("Parola Girin:");
            password=scan.nextInt();
            if (password==123){
                System.out.println("Giriş Başarılı...");
                askPassword=false;
            }else {
                System.out.println("Giriş Başarısız");
            }
        }while (askPassword);


    }
}
