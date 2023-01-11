import javax.swing.plaf.IconUIResource;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;

    Course (String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
       // this.teacher=teacher;
        this.note=0;
    }

    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
            printTeacher();
        }else {
            System.out.println("ÖĞRETMEN BRANŞI VE DERS BRANŞI UYUMSUZ");
        }


    }
    void printTeacher(){
        this.teacher.printT();
    }
}
