import java.util.Scanner;

public class TStars {
    public static void main(String[] args) {
        int sayi;
        Scanner scan=new Scanner(System.in);

        System.out.print("Kaç Basamak Olacak:");
        sayi=scan.nextInt();

        for (int i=1;i<=sayi;i++){
            for (int j=1;j<=sayi-i;j++){
                System.out.print(" ");
            }for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=sayi;i>=1;i--){
            for (int j=sayi-i;j>=1;j--){ //int j=0;j<sayi-i;j++
                System.out.print(" ");
            }for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
