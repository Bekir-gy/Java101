import java.util.Arrays;

public class EnYakinMaxMin2 {
    public static void main(String[] args) {
        int [] list={15,12,788,1,-1,-788,-2,0};
        MinMax(list,5);



    }
    static void MinMax(int arr[],int Value){
        int max=Value, min=Value;
        Arrays.sort(arr);
        if (Value<arr[0] || Value>arr[arr.length-1]){
            System.out.println("Girdiğiniz Değer Dizinin en küçük değeri olan "+arr[0]+" ve en büyük değeri olan "
                    +arr[arr.length-1]+" değeri dışında kalıyor");
        }else {
            for (int i:arr){
                if (i<Value)
                    min=i;
            }
            for (int i=arr.length-1;i>=0;i--)
                if (arr[i]>Value)
                    max=arr[i];
        }
        System.out.println("En Yakın Küçük:"+min);
        System.out.println("En Yakın Büyük:"+max);
    }
}
