package first;

public class FirstClass {
     String str;

    public FirstClass(String str){
        this.str=str;
    }

    private void show(){
        System.out.println(this.str);
    }
    public void goster(){
        this.show();
    }
}
