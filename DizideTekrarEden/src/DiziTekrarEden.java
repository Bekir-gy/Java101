import java.util.Arrays;

public class DiziTekrarEden {
    static boolean isFind(int [] arr,int val){
        for (int i:arr){
            if (i==val)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list={1,22,11,5,8,9,1,33,7,1,6,22};

        int [] duplicate=new int[list.length];
        int sayac=0;

        for (int i=0;i< list.length;i++){
            for (int j=0;j< list.length;j++){
                if (( i!=j )&& (list[i]==list[j])) {
                    if (!(isFind(duplicate,list[i])))
                    duplicate[sayac++]=list[i];
                    break;
                }
            }
        }
       // System.out.println(Arrays.toString(duplicate));
        for (int read:duplicate){
            if (read!=0)
                System.out.println(read);
        }
    }
}
