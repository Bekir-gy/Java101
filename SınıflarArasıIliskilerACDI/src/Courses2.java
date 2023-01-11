public class Courses2 {
    private String name;
    private String code;
    private Instructor2 instructor2;


    public Courses2(String name,String code,Instructor2 instructor2){
        this.name=name;
        this.code=code;
        this.instructor2=instructor2;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String  name){
        this.name=name;
    }

    public  String getCode(){
        return this.code;
    }

    public void setCode(String code){
        this.code=code;
    }

    public Instructor2 getInstructor2(){ //composition
        return this.instructor2;
    }
    // Courses has a Instructor
    public void setInstructor2(Instructor2 instructor2){ //composition
        this.instructor2=instructor2;
    }


    //depedency Courses uses a Student
    public double calcAverage(Student2 [] notlar){
        double average=0;
        for (Student2 st:notlar){
            average+=st.getNote();
        }
        return average/ notlar.length;
    }

}
