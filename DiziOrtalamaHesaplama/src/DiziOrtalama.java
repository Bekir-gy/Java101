public class DiziOrtalama {
    public static void main(String[] args) {
        int [] list={11,4,6,23,5};
        double total=0,average=0;
        for (int i=0;i<list.length;i++){
            total+=list[i];
        }
        average=total/list.length;
        System.out.println(average);

    }
}
