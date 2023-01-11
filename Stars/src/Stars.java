import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        int sayi;
        Scanner scan=new Scanner(System.in);

        System.out.print("Kaç Satir Olacak:");
        sayi= scan.nextInt();
        int design=sayi;

        for (int i=1;i<=sayi;i++){
            for (int k=1;k<design; k++){
                System.out.print(" ");
            }for (int j=1;j<=(2*i-1);j++) {
                System.out.print("*");
            }
            design--;
            System.out.println();
        }
    }
}
