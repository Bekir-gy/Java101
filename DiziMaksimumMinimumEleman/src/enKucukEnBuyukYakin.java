import java.util.Scanner;

public class enKucukEnBuyukYakin {
    public static void main(String[] args) {
        int[] list={15,12,788,1,-1,-788,2,0};
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayiyi Giriniz:");
        int sayi=scan.nextInt();
        int [] maxList =new int[list.length];
        int [] minList = new int[list.length];
        int count=0,count2=0;


        for (int i=0;i<list.length;i++){
            if (list[i]>sayi){
                maxList[count]= list[i];
                count++;
            }
            if (list[i]<sayi){
                minList[count2]= list[i];
                count2++;
            }
        }
        int maxL=maxList[0],minL=minList[0];
        for (int i=0;i<maxList.length;i++){
            if (maxList[i]<maxL && maxList[i]!=0)
                maxL=maxList[i];
        }
        for (int i=0;i<minList.length;i++){
            if (minList[i]>minL)
                minL=minList[i];
        }
        System.out.println("Girilen Sayıdan EN BÜYÜK YAKIN:"+maxL);
        System.out.println("Girilen Sayıdan EN KÜÇÜK YAKIN:"+minL);
    }
}