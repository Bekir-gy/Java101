import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int a;

        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();

        switch (a){
            case 1:
                System.out.println("Bugün Pazartesi");
                System.out.println("PROGRAM BİTTİ");
                break;
            case 2:
                System.out.println("Bugün Sali");
                break;
            case 3:
                System.out.println("Bugün Çarsamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            default:
                System.out.println("Hatalı bir giriş...");
        }
    }
}
