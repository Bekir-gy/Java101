import java.util.Scanner;

public class DeseneGoreRecursive {
    static int Desen(int x){
        int result;
        if (x<=0){
           System.out.print(x+" ");
            return 0;
        }
        else {
            System.out.print(x+" ");
            result=Desen(x-5)+5;
           System.out.print(x+" ");
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayiyi Giriniz:");
        int sayi=scan.nextInt();
        Desen(sayi);
    }
}
/**if (x<=0 || y<x ){
        System.out.print(x+" ");
        return Desen(x+5,y-5);
        }
        else {

        System.out.print(x+" ");
        return Desen(x - 5,y++);
        }**/