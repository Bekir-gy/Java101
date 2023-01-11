import java.util.Scanner;

public class StarsWhile {
    public static void main(String[] args) {
        int sayi;
        int i=1,k=1,j=1;

        Scanner scan=new Scanner(System.in);

        System.out.print("Kaç Basamak Olacak:");
        sayi=scan.nextInt();

        while (i<=sayi){
            while (j<=sayi-i){
                System.out.print(" ");
                j++;
            }while (k <= (2*i-1)){
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
            j=1;
            k=1;

        }
    }
}
