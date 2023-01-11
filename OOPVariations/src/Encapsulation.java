public class Encapsulation {
    public static void main(String[] args) {
        Kitap book=new Kitap("Kitap1","YAZAR",-20);
        Kitap book2=new Kitap("Kitap2","Yazar2",200);

        book.yazdir();
        System.out.println();

        book.setSayfaSayisi(1200);
        System.out.println(book.getSayfaSayisi());
        book.setKitapAdi("kitaplar");
        System.out.println(book.getKitapAdi());
        /*book.setKitapAdi("yeniKitap");
        System.out.println(book.getKitapAdi());

        book.setSayfaSayisi(50);
        System.out.println(book.getSayfaSayisi());*/

    }
}
