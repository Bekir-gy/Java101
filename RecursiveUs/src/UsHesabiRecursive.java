import java.util.Scanner;

public class UsHesabiRecursive {
    static int power(int taban,int us){
        if (us==1)
            return taban;
        return power(taban,us-1)*taban;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Taban Degerini Girin:");
        int taban=scan.nextInt();
        System.out.print("Ussu Girin:");
        int us=scan.nextInt();
        System.out.println(power(taban,us));

    }
}
