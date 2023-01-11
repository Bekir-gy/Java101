import java.util.Scanner;

public class StarsDuzenlenmis {
    public static void main(String[] args) {
        int sayi;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Basamak Olacak:");
        sayi=scan.nextInt();

        for (int i=1; i<=sayi;i++){
            for (int j=1; j<=(sayi-i);j++){
                System.out.print(" ");
            }for (int k=1; k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
