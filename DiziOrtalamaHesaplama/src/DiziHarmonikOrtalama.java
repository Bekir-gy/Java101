public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        int [] list={5,7,11,23,48};
        double total=1;
        for (int i=0;i<list.length;i++){
            total+=(1.0/list[i]);
        }
        System.out.println(total);
        System.out.println(list.length/total);
    }
}
