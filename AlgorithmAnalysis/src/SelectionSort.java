import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static int [] selectionSort(int []arr){
        int tmp;
        int min;
        for (int i=0;i< arr.length-1;i++){
            min=i;
            for (int j=i; j<arr.length;j++){
                if (arr[j]<arr[min]){
                    tmp=arr[j]; //min=j; veya arr[min]=arr[j];
                    arr[j]=arr[min];
                    arr[min]=tmp;
                }
            }

            /*
              tmp=arr[i];
              arr[i]=arr[min];
              arr[min]=tmp;
            */
        }

        return arr;
    }

    public static void main(String[] args) {
        int []arr={5,11,8,25,6,74,2};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }
}
