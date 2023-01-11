import java.util.Scanner;

public class Solution2 {
    static boolean canWin(int [] arr, int leap, int i){
       if (i>=arr.length) return true;
       if (i<0 || arr[i]==1) return false;
       arr[i]=1;

       return  canWin(arr, leap, i+leap) || canWin(arr, leap, i+1) || canWin(arr, leap, i-1);

        /*if (i>= arr.length)
            return true;
        if (arr[i]==0){
            arr[i]=1;
            if (canWin(arr, leap, i+leap)) return true;
            if (canWin(arr, leap, i+1)) return  true;
            if (i>0){
                if (canWin(arr, leap, i-1)) return true;
            }
        }


        return false;*/
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();
        while (count-- > 0){
            int n= scan.nextInt();
            int leap=scan.nextInt();
            int [] arr=new int[n];
            for (int i=0 ; i<arr.length;i++){
                arr[i]= scan.nextInt();
            }
            System.out.println(canWin(arr,leap,0)? "Yes": "no");

        }

    }
}
