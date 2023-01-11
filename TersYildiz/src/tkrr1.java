import javafx.scene.transform.Scale;

import java.util.Scanner;

public class tkrr1 {
    public static void main(String[] args) {
        int sayi,i=1,k=1,j=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Basamaklı olacak:");
        sayi=scan.nextInt();

        while (i<=sayi){
            while (j<=sayi-i){
                System.out.print(" ");
                j++;
            }
            while (k<=2*i-1){
                System.out.print("*");
                k++;

            }
            System.out.println();
            i++;
            j=1;
            k=1;
        }
        i=sayi;
        while (i>=1){
            while (j<=sayi-i){
                System.out.print(" ");
                j++;
            }while (k<=2*i-1){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
            j=1;
            k=1;
        }

    }
}
