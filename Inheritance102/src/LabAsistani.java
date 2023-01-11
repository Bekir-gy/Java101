public class LabAsistani extends Asistan{
    public LabAsistani(String adiSoyadi, String Telefon , String mail, String bolum, String unvan,String ofisSaati){
        super(adiSoyadi, Telefon, mail, bolum, unvan, ofisSaati);
    }
    public void LablaraGir(){
        System.out.println(this.getAdSoyad()+" Laba girdi.");
    }
    @Override
    public void quizYap(){
        System.out.println(this.getAdSoyad()+" lab asistanı olarak quiz yapıyor");
    }
}
