import java.util.Arrays;

public class ArraysSınıfı {
    public static void main(String[] args) {

        int [] list={1,5,8,9,22};
        double [] list2={1.2, 2.5,5.8};
        int [] list3={5,-22,89,26,10,47};

       /* Helper sınıfındaki print metodu static OLMAZSA nesne üreterek
        HelperArray helper=new HelperArray();
        helper.print(list);
        */

        // Helper sınıfındaki print metodu static OLURSA nesne üretmeden
        HelperArray.print(list);
        HelperArray.print(list2);
        System.out.println();

        //Arrays.ToString
        System.out.println(Arrays.toString(list));

        //Fill
        Arrays.fill(list3,11);
        System.out.println(Arrays.toString(list3));

        //Fill Helper sınıfında olşan
        list3=HelperArray.Filler(list3, 15);
        System.out.println(Arrays.toString(list3));
        //diğer gösterim
        System.out.println(Arrays.toString(HelperArray.Filler(list3,12)));

        //Fill Değer Aralıklı
        Arrays.fill(list3,2,4,77);
        System.out.println(Arrays.toString(list3));

        //Fill Değer Aralıklı Helper sınıfında oluşan
        System.out.println(Arrays.toString(HelperArray.Filler(list3,2,4,88)));

        //Array.sort
        int [] liste4={-58, 11 , 45,3,7,23,88,10,6};
       Arrays.sort(liste4);
        System.out.println(Arrays.toString(liste4));

        //Helper Sınıfında oluşan Search Metodu
        System.out.println(HelperArray.search(liste4,10));

        //BinearySearch
        int [] liste5={-23,-54,-11,-8,23,88,45,6,9,12,5,36,7};
        Arrays.sort(liste5);
        System.out.println(Arrays.toString(liste5));
        System.out.println(Arrays.binarySearch(liste5,23));

        //CopyOf Manuel Helper sınıfında oluşan Metot
        int [] liste6={11,42,78,36,10,1,-5,-11,12,33};
        System.out.println(Arrays.toString(HelperArray.Copy(liste6,liste6.length)));
        System.out.println(Arrays.toString(HelperArray.Copy(liste6,4)));

        //CopyOf
        System.out.println(Arrays.toString(Arrays.copyOf(liste6,4)));
        //Diğer Gösterim
        int [] copyNew=Arrays.copyOf(liste6,4);
        System.out.println(Arrays.toString(copyNew));


        //CopyOfRange Manuel Helper Sınıfında Oluşan
        System.out.println(Arrays.toString(HelperArray.Copy(liste6,2,5)));

        //CopyOfRange
        int []  copyNew2=Arrays.copyOfRange(liste6,2,5);
        System.out.println(Arrays.toString(copyNew2));
        //Diğer Gösterim
        System.out.println(Arrays.toString(Arrays.copyOfRange(liste6,2,5)));

        //equals Manuel olarak Helper Sınıfında Oluşan
        int[] miniList={1,2,3};
        int[] miniList2={15,45,7};
        int[] miniList3={1,2,3};
        int[] miniList4={1,2,3,4};
        System.out.println(HelperArray.equals(miniList,miniList3));
        System.out.println(HelperArray.equals(miniList,miniList4));

        //Equals
        System.out.println(Arrays.equals(miniList,miniList3));
        System.out.println(Arrays.equals(miniList,miniList2));


    }
}
