import java.util.Arrays;

public class Frekans {
    public static void main(String[] args) {
        int [] list={10,20,20,10,10,20,5,20};
        int sayac10=0;
        int sayac20=0;
        int sayac5=0;
        for (int i=0;i< list.length;i++){
            if (list[i]==10)
                sayac10++;
            else if (list[i]==20)
                sayac20++;
            else
                sayac5++;
        }
        System.out.println("Dizi: "+Arrays.toString(list));
        System.out.println("Tekrar Sayıları\n"+
                "10 Sayısı "+sayac10+" kere Tekrar Edildi\n" +
                "20 Sayısı "+sayac20+" kere Tekrar Edildi\n" +
                "5 Sayısı "+sayac5+" kere Tekrar Edildi");
    }
}
