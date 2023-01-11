public class AsalSayiBulma {
    public static void main(String[] args) {
        int sayac=0;
        for (int sayi = 2; sayi <= 100; sayi++) {
            for (int j=1;j<sayi;j++){
                if (sayi%j==0){
                   sayac++;
                }
            }if (sayac<=1)
                System.out.print(sayi+" ");
            sayac=0;
        }
    }
}

