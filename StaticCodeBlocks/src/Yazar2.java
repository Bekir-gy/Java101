public class Yazar2 {
    private String isim;
    private String eser;

    public Yazar2(String isim,String eser){
        this.isim=isim;
        this.eser=eser;
    }

    public String getIsim(){
        return this.isim;
    }
    public void setIsim(String isim){
        this.isim=isim;
    }
    public String getEser(){
        return this.eser;
    }
    public void setEser(String eser){
        this.eser=eser;
    }
    public void yazdir (){
        System.out.println("Adi:"+this.isim+" Eseri:"+this.eser);
    }
}
