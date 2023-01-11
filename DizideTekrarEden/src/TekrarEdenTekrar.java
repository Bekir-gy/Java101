import java.util.Arrays;

public class TekrarEdenTekrar {
    static boolean isTry(int [] arr,int val){
        for (int i:arr){
            if (i==val)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list={1,22,5,7,8,1,54,7,11};
        int [] duplicate=new int[list.length];
        int sayac=0;

        for (int i=0;i< list.length;i++){
            for (int j=0;j< list.length;j++){
                if ((i!=j) && (list[i]==list[j])){
                    if (!(isTry(duplicate,list[i])))
                        duplicate[sayac++]=list[i];
                    break;
                }
            }
        }
       //System.out.println(Arrays.toString(duplicate));
        for (int read:duplicate){
            if (read!=0)
                System.out.println(read);
        }
        System.out.println();
    }
}
