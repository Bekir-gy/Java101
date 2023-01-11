public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","02154","TRH");
        //t1.printTeacher();
        Teacher t2=new Teacher("Külyutmaz","15577","BIO");

        Course tarih=new Course("Tarih","101","TRH");
        Course fizik=new Course("Fizik","102","FZK");
        Course biyo=new Course("Biyoloji","103","BIO");
        //tarih.addTeacher(t2);
        //biyo.addTeacher(t2);

        Student s1=new Student("İnek Şaban","12548","4",tarih,fizik,biyo);
        s1.addBulkExamNote(200,200,50,80,100,85);
        s1.isPass();

        Student  s2=new Student("Güdük Necmi","12588","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,100,80,80,200,100);
        s2.isPass();



    }
}
