import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanSirala {
    static int [] Sirala(int [] arr){
        int tmp;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (i!=j&&(arr[i]>arr[j])){
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
        System.out.print("Dizi Kaç Elemanlı Olsun:");
        int miktar=scan.nextInt();
        int [] list=new int[miktar];

        for (int i=0;i< list.length;i++){
            System.out.print(i+1 +".Elemanı Giriniz: ");
            list[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(Sirala(list)));
        for (int i:Sirala(list)){
            System.out.print(i+" ");
        }
    }
}
