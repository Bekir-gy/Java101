public class Main {

    static  void printArray(int[] arr){
        for (int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static int[] reverse(int[] arr2){
        int [] ters=new int[arr2.length];
        for (int i=0, j=arr2.length-1;i<arr2.length; i++, j--){
            ters[i]=arr2[j];
        }

        return ters;
    }

    public static void main(String[] args) {
        int[] list=new int[10];
        int liste[]=new int[10];
        int [] liste2={10,20,30,40,50,60,70,80};

        printArray(liste2);
        System.out.println("====================");



       int [] newListe=reverse(liste2);
       printArray(newListe);
       //printArray(reverse(liste2));
        System.out.println("==========================");



        for (int i=0; i<list.length; i++){
            list[i]=(i+1)*10;
            System.out.println(list[i]);
        }
        int i=0;
        while (i<list.length){
            list[i]=(i*10)+10;
            System.out.println(list[i]);
            i++;
        }
        for (i=0; i<liste2.length;i++){
            System.out.println(liste2[i]);
        }
    }
}
