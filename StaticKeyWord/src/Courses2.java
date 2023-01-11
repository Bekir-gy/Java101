public class Courses2 {
    public String studentname;
    public String courseName;
    public int id;

    public Courses2(String studentname,String courseName,int id){
        this.studentname=studentname;
        this.courseName=courseName;
        this.id=id;
    }

    private void show(){
        System.out.println(this.studentname);
    }
    public  void  goster(){
        this.show();
    }

    public static void  calculateaverage(Courses2 [] notlar){
        double total=0;
        for (Courses2 i:notlar){
            total+=i.id;
        }
        double average=total/ notlar.length;
        System.out.println(average);
    }

}
