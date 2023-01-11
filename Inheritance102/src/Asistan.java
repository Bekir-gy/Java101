public class Asistan extends Akademisyen{
    String ofisSaati;
    public Asistan(String adiSoyadi , String Telefon, String mail, String bolum, String unvan, String ofisSaati){
        super(adiSoyadi,Telefon,mail,bolum,unvan);
        this.ofisSaati=ofisSaati;
    }

    public String getOfisSaati(){
        return this.ofisSaati;
    }
    public void setOfisSaati(String ofisSaati){
        this.ofisSaati=ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad()+" quiz yapıyor.");
    }

    @Override
    public void derseGir(String saat){
        System.out.println(this.getAdSoyad()+" Asistanı "+saat+" derse girdi.");
    }
}
