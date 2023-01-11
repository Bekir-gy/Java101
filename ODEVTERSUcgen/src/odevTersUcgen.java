import java.util.Scanner;

public class odevTersUcgen {
    public static void main(String[] args) {
        int basamak;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Basamaklı Olsun:");
        basamak=scan.nextInt();

        for (int i=basamak;i>=1;i--){
            for (int j=0;j<basamak-i;j++){//int j=basamak-i;j>=1;j--
                System.out.print(" ");
            }for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
