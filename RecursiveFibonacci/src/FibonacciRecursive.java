import java.util.Scanner;

public class FibonacciRecursive {
    //Benim Yaptığım ilk Elemanı 0 olduğunu başladığını düşünerek
    static int fib(int n1){
        int result=0;
        if (n1==1)
            return 1;
        if (n1==0)
            return 0;

        result=fib(n1-2)+fib(n1-1);
        //System.out.println(result+" ");
        return result;

    }



    public static void main(String[] args) {
        System.out.println(fib(9));







        /**int miktar,n1=0,n2=1,result=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Elemanlı Olsun:");
        miktar=scan.nextInt();
        System.out.print(n1+" "+n2+" ");

        for (int i=2;i<=miktar;i++){
            result=n1+n2;
            System.out.print(result+" ");
            n1=n2;
            n2=result;

        }*/
    }
}
