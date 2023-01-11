import java.util.Scanner;

public class Solution {
    static boolean canWin(int [] arr,int leap,int i){
        /*if (i>= arr.length) return true;
        if(arr[i]==0){
            arr[i]=1;
            if (canWin(arr, leap, i+leap)) return true;
            System.out.println("burası1"+i);
            if (canWin(arr, leap, i+1)) return true;
            System.out.println("burası2"+i);
            if(i>0){
                if (canWin(arr, leap, i-1)) return true;
                System.out.println("burASI3"+i);
            }

        }*/
        System.out.println(i+" degeri");
        if (i>=arr.length) //amaç uzunluğa eşit veya büyükse kazanmış sayılır
           return true;
        if (i<0 || arr[i]==1)
            return false;
        System.out.println(i+" degeri");
        arr[i]=1;

        return canWin(arr,leap,i+leap) || //bunlar hamle
                canWin(arr, leap, i+1) ||
                canWin(arr, leap, i-1);
      /*  System.out.println(i+" degeri");
        return false;*/

    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();

        while (count-- > 0) {
            int n=scan.nextInt();
            int leap=scan.nextInt();
            int [] arr=new int[n];
            for (int i=0;i<arr.length;i++){
                arr[i]=scan.nextInt();
            }
            System.out.println((canWin(arr,leap,0)) ? "YES":"NO");


        }
    }

    

}
