import java.util.Arrays;
import java.util.Scanner;

public class EnYakinMaxMin {
    public static void main(String[] args) {
        int[] list={15,12,788,1,-1,-788,2,0};
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayiyi Giriniz:");
        int sayi=scan.nextInt();

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int max=sayi,min=sayi;
        for (int i=0;i<list.length;i++){
            if (list[i]>sayi){
                max=list[i];
                min=list[i-1];
                break;
            }
        }
        System.out.println("En büyük yakin:"+max);
        System.out.println("En küçük yakin:"+min);

    }

}
