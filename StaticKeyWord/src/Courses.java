public class Courses {
    public String studentNAME;
    public  String courseName;
    public int note;

    public Courses(String studentNAME,String courseName,int note){
        this.studentNAME=studentNAME;
        this.courseName=courseName;
        this.note = note;
    }

    public static void  calculateAverage(Courses [] notlar){
        double total=0;
        for (Courses i:notlar){
            total+=i.note; //coursedan türetilmiş i nesnesinin note değişkenini alıyoruz mat.note fzk.note
        }
        double average=total/ notlar.length;
        System.out.println("ORTALAMA:"+average);
    }
}
