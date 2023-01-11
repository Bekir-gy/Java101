public class MaksimumMinimum {
    public static void main(String[] args) {
        int [] list={56,-34,8,2,13,2,-47};
        int max=list[0],min=list[0];
        for (int i=0;i<list.length;i++){
            if (list[i]>=max){
                max=list[i];
            }
            if (list[i]<min){
                min=list[i];
            }
        }
        System.out.println("En büyük: "+max);
        System.out.println("En küçük: "+min);
    }
}
