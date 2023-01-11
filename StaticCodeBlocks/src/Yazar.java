public class Yazar {
    private String YazarAdi;
    private String Eseri;

    public Yazar(String YazarAdi,String Eseri){
        this.YazarAdi=YazarAdi;
        this.Eseri=Eseri;
    }

    public String getYazarAdi(){
        return this.YazarAdi;
    }
    public void setYazarAdi(String YazarAdi){
        this.YazarAdi=YazarAdi;
    }
    public String getEseri(){
        return this.Eseri;
    }
    public void setEseri(String Eseri){
        this.Eseri=Eseri;
    }
    public void bilgi(){
        System.out.println("adi="+this.YazarAdi+" Eseri="+this.Eseri);
    }
}
