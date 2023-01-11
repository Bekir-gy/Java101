public class Main {
    public static void main(String[] args) {
        Courses MAT=new Courses("ÖĞRENCİ1","MAT101",85);
        Courses FZK=new Courses("ÖĞRENC2","FZK101",88);
        Courses KMY=new Courses("ÖĞRENCİ3","KMY101",545);
        System.out.println(MAT.studentNAME);

        //int [] notlar={MAT.note, FZK.note,KMY.note};
        //MAT.calculateAverage(notlar); //calculateAverageMetodu static olmazsa nesne kullanmadan erişilmez
        Courses [] notlar={MAT,FZK,KMY};
        Courses.calculateAverage(notlar);
    }
}
