public class Main2 {
    public static void main(String[] args) {
        Courses2 Mat=new Courses2("ÖĞRENCİ1","MAT101",78);
        Courses2 FZK=new Courses2("Öğrenci2","FZK101",55);
        Courses2 KMY=new Courses2("öğrenci2","kmy101",85);
       //  Mat.show();
        System.out.println(FZK.id);
        Mat.goster();

       // int [] notlar={Mat.id, FZK.id, KMY.id};
      //  Mat.calculateaverage(notlar);
        Courses2 [] notlar={Mat,FZK, KMY};
        Courses2.calculateaverage(notlar);


    }
}
