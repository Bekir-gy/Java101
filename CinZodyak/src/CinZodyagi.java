import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dateOfyear,sonuc;
        Scanner scan= new Scanner(System.in);

        System.out.print("Doğum yılını:");
        dateOfyear=scan.nextInt();
        sonuc=dateOfyear%12;

        switch (sonuc){
            case 0:
                System.out.println("Çin zodyağı burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin zodyağı burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin zodyağı burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Çin zodyağı burcunuz: Domz");
                break;
            case 4:
                System.out.println("Çin zodyağı burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin zodyağı burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Çin zodyağı burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin zodyağı burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Çin zodyağı burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin zodyağı burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Çin zodyağı burcunuz: At");
                break;
            case 11:
                System.out.println("Çin zodyağı burcunuz: Koyun");
                break;
            default:
                System.out.println("HATALI DEĞER GİRDİNİZ...");
        }

    }
}
