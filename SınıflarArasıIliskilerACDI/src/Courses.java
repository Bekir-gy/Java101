public class Courses {
    private String name;
    private  String code;
    private  Instructor instructor;// composition

    public Courses(String name,String code,Instructor instructor){
        this.name=name;
        this.code=code;
        this.instructor=instructor;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code=code;
    }

    public Instructor getInstructor(){ //composotion
        return this.instructor;
    }

    public void setInstructor(Instructor instructor){ //composotion
        this.instructor=instructor;
    }

    //Dependency Courses uses a Student  Bağımlılık
    public double averageCalc(Student [] notlar){ // arrayin tipi Student sınıfı
        double average=0;
        for (Student s: notlar){
            average+=s.getNote();
        }
       /* for (int i=0;i< notlar.length;i++){
            average+=notlar[i].getNote();
        }
        */
        return  average/ notlar.length;
    }
}
