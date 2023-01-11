public class HelperArray {
    static void print(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    static void print(double [] arr){
        for ( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static  int[]  Filler(int [] arr,int value){
        for (int i=0; i< arr.length;i++){
            arr[i]=value;

        }
        return arr;
    }

    static  int[] Filler(int [] arr,int FromIndex, int toIndex, int value){
        for (int i=FromIndex; i<toIndex;i++){
            arr[i]=value;
        }
        return arr;
    }

    /* bu biraz uzun aşağıdaki metot daha kısa
    static int search (int [] arr,int searcValue){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==searcValue)
                return count;
            else
                count++;
        }
        return  count;
    }*/

    // yukarıdaki metotun daha kısa hali
    static int search(int arr[], int searchValue){
        for (int i=0; i<arr.length;i++){
            if (arr[i]==searchValue)
                return i;
        }
        return -1;
    }

    static int [] Copy(int [] arr,int copyValue){
        int [] copyArray = new int[copyValue];
        for (int i=0 ; i<copyValue; i++){
            copyArray[i]=arr[i];
        }
        return  copyArray;

    }

    static  int[] Copy(int [] arr,int startIndex,int finishIndex){
        int [] copyArray=new int[finishIndex-startIndex];
        for (int i=0,j=startIndex; i<finishIndex-startIndex;i++,j++){
            copyArray[i]=arr[j];
        }
        return copyArray;
    }

    static boolean equals(int []arr, int [] arr2){
        if (arr.length==arr2.length){
            for (int i=0; i<arr.length;i++){
                if (arr[i]!=arr2[i])
                return false;
            }
            return true;
        }

        return false;
    }
}
