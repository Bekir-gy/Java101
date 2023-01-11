public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;

    Course(String name, String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
       // this.teacher=teacher;

    }
    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
            printtTeacher();
        }
        else {
            System.out.println("ÖĞRETMEN BRANŞI VE DERS UYMUYOR");
        }

    }
    void printtTeacher(){
        this.teacher.printTeacher();
    }
}
