public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        double average=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1,int note2, int note3){
        this.c1.note=note1;
        this.c2.note=note2;
        this.c3.note=note3;

    }
    void isPass(){
        this.average=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if (this.average<55){
            System.out.println("kaldı");
            this.isPass=false;
        }else {
            System.out.println("Geçti");
            this.isPass=false;

        }
        printNote();

    }

    void printNote(){

        System.out.println(this.c1.name+" Notunuz:"+this.c1.note);
        System.out.println(this.c2.name+" Notunuz:"+this.c2.note);
        System.out.println(this.c3.name+" Notunuz:"+this.c3.note);
        System.out.println("Ortalamanız:"+this.average);
        System.out.println("======");
    }

}
