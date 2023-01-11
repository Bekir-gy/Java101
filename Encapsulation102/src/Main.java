public class Main {
    public static void main(String[] args) {
        Book kitap1=new Book("harry",100);
        Book kitap2=new Book("lord",520);
        kitap2.setPageNumber(80);
        kitap1.setName("kitap");

        System.out.println(kitap1.getName());

        System.out.println(kitap2.getPageNumber());
    }
}
