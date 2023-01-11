public abstract class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String Telefon, String mail,String bolum,String unvan){

        super(adSoyad, Telefon, mail);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum(){
        return this.bolum;
    }
    public void setBolum(String bolum){
        this.bolum=bolum;
    }
    public String getUnvan(){
        return this.unvan;
    }
    public void setUnvan(String  unvan){
        this.unvan=unvan;
    }
    /*public void derseGir(){
        System.out.println(this.getAdSoyad()+" DERSE GİRDİ.");
    }*/
    public abstract void derseGir(String dersSAAT);
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+" Akademisyeni B Kapısından giriş yaptı.");
    }
}
