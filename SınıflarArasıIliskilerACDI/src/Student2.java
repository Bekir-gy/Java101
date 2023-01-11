public class Student2 {
    private String name;
    private String surname;
    private String Idno;
    private String address;
    private  int note;


    public Student2(String name, String surname, String Idno, String address, int note){
        this.name=name;
        this.surname=surname;
        this.Idno=Idno;
        this.address=address;
        if (note>100 || note<0){
            note=0;
        }
        this.note=note;
    }

    public String getName(){
        return this.name;
    }

    public void  setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void  setSurname(String surname){
        this.surname=surname;
    }
    public String getIdno(){
        return this.Idno;

    }
    public void setIdno(String Idno){
        this.Idno=Idno;
    }
    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public int getNote(){
        return this.note;
    }
    public void setNote(int note){
        if (note>100 || note<0){
            note=0;
        }
        this.note=note;
    }
}
