public  abstract class Memur  extends  Calisan{
    private  String departman;
    private String mesai;

    public Memur(String adSoyad,String Telefon, String mail,String departman,String mesai){
        super(adSoyad, Telefon, mail);
        this.departman=departman;
        this.mesai=mesai;

    }
    public abstract void calisAbstraction(String cSaaati);

    public void calis(){
        System.out.println(this.getAdSoyad()+" calismaya başladı");
    }
    // overloading
    public void calis(String gorev,String telefon){
        System.out.println(this.getAdSoyad()+" çalışmaya başladı görevi "+ gorev +" telfonu:"+ telefon);
    }

    public String getDepartman(){
        return this.departman;
    }
    public void setDepartman(String departman){
        this.departman=departman;
    }
    public String getMesai(){
        return this.mesai=mesai;
    }
    public void setMesai(String mesai){
        this.mesai=mesai;
    }

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+ " memuru d kapısından giriş yaptı.");
    }
}
