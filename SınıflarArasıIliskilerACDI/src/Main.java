public class Main {
    public static void main(String[] args) {
        Student st1=new Student("öğrenci","soyadı","54545","adresss",100);
        Student st2=new Student("öğrenci2","soyadı2","878778","addresssss",90);


        Instructor instructor=new Instructor("ınstructor1","ınstructorsurname");

        //composition aggretation courses has a instructor
        Courses mat=new Courses("mAT","MAT101",instructor);
        System.out.println(mat.getInstructor().getName());

        //dependency
        Student [] notlar={st1,st2}; //Student veri tipinden array
        System.out.println("ortalama:"+mat.averageCalc(notlar));
        System.out.println(st1.getNote());
    }
}
