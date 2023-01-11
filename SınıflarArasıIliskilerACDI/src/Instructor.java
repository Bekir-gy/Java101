public class Instructor {
    private  String name;
    private String surName;

    public  Instructor(String name,String surName){
        this.name=name;
        this.surName=surName;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getSurName(){
        return this.surName;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }

}
