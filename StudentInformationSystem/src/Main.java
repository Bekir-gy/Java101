public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","0546464","TRH");
        Teacher t2=new Teacher("Graham Bell","0257524","FZK");
        Teacher t3=new Teacher("Külyutmaz","05126","BIO");

        Course tarih=new Course("Tarih","101","TRH");
        Course fizik=new Course("Fizik","102","FZK");
        Course biyo=new Course("Biyoloji","103","BIO");

        biyo.addTeacher(t3);
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);

        Student s1=new Student("İnek Şaban","1254","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,70,70);
        s1.isPass();
        //s1.printNote();
        Student s2=new Student("Güdük Necmi","54521","4",tarih,fizik,biyo);
        s2.addBulkExamNote(100,40,10);
        s2.isPass();

    }
}
