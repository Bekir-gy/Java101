public class Tkrr {

    static void printArray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static int[] reverseArray(int [] arr2){
        int[] arr3=new int[arr2.length];
        for (int i=0, j=arr2.length-1;i<arr2.length;i++,j--){
            arr3[i]=arr2[j];
        }
        return arr3;
    }


    public static void main(String[] args) {
        int [] list=new int[10];
        int [] list2=new int[9];
        int [] list3= {10,20,30,40};

        //alternatif
        int [] NEWlist=reverseArray(list3);
        printArray(NEWlist);
        //alternatif2
       printArray(reverseArray(list3));



        System.out.println("==================000");

        for (int i=0; i<list.length; i++){
            //list[i]=(i+1)*10;
            list[i]=(i*10)+10;
           // System.out.println(list[i]);
        }
        printArray(list);

        int i=0;
        while (i<list2.length){
            list2[i]=(i+1)*10;
            System.out.println(list2[i]);
            i++;
        }
    }
}
