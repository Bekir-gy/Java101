public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    Boolean isPass;

    Student (String name, String stuNo, String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int note1, int note2, int note3,int sozluTarih,int sozluFizik,int sozluBiyo){
        if (note1>=0 && note1<=100){
            if (sozluTarih>=0 && sozluTarih<=100){
                this.c1.note=note1*0.80+sozluTarih*0.20;
            }
            else {
                this.c1.note=note1*0.80;
            }
        }else {
            if (sozluTarih>=0 && sozluTarih<=100)
                this.c1.note=sozluTarih*0.20;
        }
        if (note2>=0 && note2<=100){
            if (sozluFizik>=0 && sozluFizik<=100){
                this.c2.note=note2*0.80+sozluFizik*0.20;
            }
            else {
                this.c2.note=note2*0.80;
            }
        }else {
            if (sozluFizik>=0 && sozluFizik<=100)
                this.c2.note=sozluFizik*0.20;
        }

        if (note3>=0 && note3<=100){
            if (sozluBiyo>=0 && sozluBiyo<=100){
                this.c3.note=note3*0.80+sozluBiyo*0.20;
            }else {
                this.c3.note=note3*0.80;
            }
        }else {
            if (sozluBiyo>=0 && sozluBiyo <=100)
                this.c3.note=sozluBiyo*0.20;
        }
    }
    void isPass(){
        //this.average=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        System.out.println("=========");
        calcAverage();
        isPass=isCheckPass();
        if (isPass){
            System.out.println("Hababam Sınıfı Uyanıyor");
            printNote();
            //this.isPass=true;
        }else {
            System.out.println("Hababam Sınıfı Sınıfta Kaldı");
            printNote();
            //this.isPass=false;
        }
    }
    void calcAverage(){
        this.average=(this.c1.note+this.c2.note+this.c3.note)/3.0;
    }
    boolean isCheckPass(){
        return this.average>55;
    }
    void printNote(){
        System.out.println(this.name+" İsimli Öğrencinin");
        System.out.println(this.c1.name+" Dersinin Notu:"+this.c1.note);
        System.out.println(this.c2.name+" Dersinin Notu:"+this.c2.note);
        System.out.println(this.c3.name+" Dersinin Notu:"+this.c3.note);
        System.out.println("Ortalaması:"+this.average);
    }
}
