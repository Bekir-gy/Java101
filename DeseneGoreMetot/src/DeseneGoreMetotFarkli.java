import java.util.Scanner;

public class DeseneGoreMetotFarkli {
    static int DesenM(int x,int n,boolean kontrol){
        if (x<=0 || x<n && kontrol) {//x<=n olursa return x 21 olur ve
            // mainde ekrana yazdırma yerine mainde sadece metotu çağırmak gerekir gizlemek için
            System.out.print(x + " ");
           return DesenM(x+5,n,true);
        }else if (x>0 && !kontrol){// x>0 olmasada geçerli
            System.out.print(x+" ");
            return DesenM(x-5,n,false);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayiyi Giriniz:");
        int sayi=scan.nextInt();
        System.out.println(DesenM(sayi,sayi,false));// sadece metot çağırılır yukarıdaki olursa
    }
}