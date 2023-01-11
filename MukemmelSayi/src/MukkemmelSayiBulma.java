import java.util.Scanner;

public class MukkemmelSayiBulma {
    public static void main(String[] args) {
        int sayi,total=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayiyi Giriniz:");
        sayi=scan.nextInt();
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                total+=i;
            }
        }
        if (total==sayi && sayi!=1){
            System.out.println(sayi+" Sayisi Mükemmel Sayidir.");
        }
        else {
            System.out.println(sayi+" Mükemmel Sayi Değildir.");
        }
    }
}
