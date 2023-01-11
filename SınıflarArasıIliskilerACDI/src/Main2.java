public class Main2 {
    public static void main(String[] args) {
        Student2 ogr=new Student2("isim1","soisim2","4548","address1",10);
        Student2 og1=new Student2("isim2", "ssoisim2","4848","addres2",70);

        Instructor2 teacher=new Instructor2("TEACHER1","TEACHERSURNAME");

        //composition agretation courses has a instructor
        Courses2 mat=new Courses2("MAT","MAT101",teacher);
        teacher.setName("advac");
        System.out.println(mat.getInstructor2().getName());

        Student2 [] notlar={ogr,og1}; //dependency
        System.out.println(mat.calcAverage(notlar));


        ogr.setNote(50);
        System.out.println(ogr.getNote());
    }
}
