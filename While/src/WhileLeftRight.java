import java.util.Scanner;

public class WhileLeftRight {
    public static void main(String[] args) {
       /** int left=100,right=200;
        while (++left<--right);
        System.out.println(left);
        */
       int password;
       boolean isPasswordSuccesful=false;

        Scanner scan= new Scanner(System.in);

       while (!isPasswordSuccesful){
           System.out.print("Parola Girin:");
           password= scan.nextInt();
           if (password==123) {
               System.out.println("Giri Başarılı");
               isPasswordSuccesful=true;
           }else
               System.out.println("Giriş Başarısız");

       }
    }
}
