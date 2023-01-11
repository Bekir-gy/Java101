import java.util.Arrays;
import java.util.Scanner;

public class tekrarDizisirala {
    static int[] Siralama(int [] arr){
        int tmp;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Dizi Kaç Elemanlı olsun:");
        int miktar=scan.nextInt();
        int [] list=new int[miktar];
        for (int i=0;i< list.length;i++){
            System.out.print(i+1 +".Elemani GİRİNİZ:");
            list[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(Siralama(list)));
        for (int read:Siralama(list)){
            System.out.print(read+" ");
        }
    }
}
