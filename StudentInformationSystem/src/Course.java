public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        //this.teacher=teacher;


    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
           printTeacher();
        }
        else {
            System.out.println("ÖĞRETMEN BRANŞ VE DERS BRANŞI UYMUYOR");
        }

    }

    void printTeacher(){
        this.teacher.printt();
        System.out.println("==========");
    }



}
