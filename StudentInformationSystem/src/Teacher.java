public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String mpno, String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    void printt(){
        System.out.println("ADI:"+this.name);
        System.out.println("Numara:"+this.mpno);
        System.out.println("Branş:"+this.branch);
    }



}
