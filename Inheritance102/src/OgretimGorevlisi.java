public class OgretimGorevlisi extends Akademisyen{
    private  String kapiNo;

    public OgretimGorevlisi(String adiSoyad,String Telefon, String mail,String bolum,String unvan,String kapiNo){
        super(adiSoyad,Telefon,mail,bolum,unvan);
        this.kapiNo=kapiNo;
    }
    /*public OgretimGorevlisi(normalde burası yukarıdaki gibi dolu olmalı ){ inheritance alternatif kullanım
                               ama super metodu ile çağırdığımız üstsınıfın constructor değerlerini
                               bu şekilde manuel girersek boş bırakabiliriz
        super("adısoyadı","58584","mailll","bolum","unvan");
        this.kapiNo=kapiNo;
    }*/

    public String getKapiNo(){
        return this.kapiNo;

    }
    public void setKapiNo(String kapiNo){
        this.kapiNo=kapiNo;
    }

    public void SenatoToplantisi(){
        System.out.println(this.getAdSoyad()+" senato toplantısına girdi.");
    }
    public void SinavYap(){
        System.out.println(this.getAdSoyad()+" sinav yapıyor.");
    }
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+" Öğretim görevlisisi c kapısından giriş yaptı.");
    }

    @Override
    public void derseGir(String saat){
        System.out.println(this.getAdSoyad()+" öğretim görevlisi "+saat+" derse girdi");
    }
}
