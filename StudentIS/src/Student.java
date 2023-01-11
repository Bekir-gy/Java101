public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo,String classes,Course c1, Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int note1, int note2 , int note3,int sozlutarih, int sozlufizik, int sozlubiyo ){
        if (note1>=0 && note1<=100){
            if (sozlutarih>=0 && sozlutarih<=100){
                this.c1.note=note1*0.80 + sozlutarih*0.20;
            }else {
                this.c1.note=note1*0.80;
            }
        }else {
            if (sozlutarih>=0 && sozlutarih<=100)
            this.c1.note=sozlutarih*0.20;
        }

        if (note2>=0 && note2<=100){
            if (sozlufizik>=0 && sozlufizik<=100){
                this.c2.note=note2*0.80+ sozlufizik*0.20;
            }else {
                this.c2.note=note2*0.80;
            }
        }else {
            if (sozlufizik>=0 && sozlufizik<=100)
                this.c2.note=sozlufizik*0.20;
        }

        if (note3>=0 && note3<=100){
            if (sozlubiyo>=0 && sozlubiyo<=100){
                this.c3.note=note3*0.80+ sozlubiyo*0.20;
            }else {
                this.c3.note=note3*0.80;
            }
        }else {
            if (sozlubiyo>=0 && sozlubiyo<=100)
                this.c3.note=sozlubiyo*0.20;
        }
    }
    void isPass(){
        this.average= (this.c1.note+this.c2.note+this.c3.note)/3.0;
        System.out.println("============");
        if (this.average>55){
            System.out.println("Hababam Sınıfı Uyanıyor");
            prinNote();
            isPass=true;
        }else {
            System.out.println("Hababam Sınıfı Sınıfta Kaldı");
            prinNote();
            isPass=false;
        }
    }
    void prinNote(){
        System.out.println(this.name+" İsimli Öğrencinin");
        System.out.println(this.c1.name+" Dersin Notu:"+this.c1.note);
        System.out.println(this.c2.name+" Dersin Notu:"+this.c2.note);
        System.out.println(this.c3.name+" Dersin Notu:"+this.c3.note);
        System.out.println("Ortalaması:"+this.average);
    }
}
