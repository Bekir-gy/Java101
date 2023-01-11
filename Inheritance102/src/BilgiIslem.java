public class BilgiIslem extends  Memur{
    private  String gorev;
    public BilgiIslem(String adiSoyadi, String Telefon,String mail, String departman,String mesai,String gorev){
        super(adiSoyadi,Telefon,mail,departman,mesai);
        this.gorev=gorev;
    }
    public String getGorev(){
        return this.gorev;
    }
    public void setGorev(String gorev){
        this.gorev=gorev;
    }

    public void NetworkKurulum(){
        System.out.println(this.getAdSoyad()+ " Network kurulumuna Başladı.");
    }

    public void calis(String gorev){
        System.out.println(this.getAdSoyad()+" çalışmaya başladı görevi "+ gorev);
    }

    @Override
    public void calisAbstraction(String cSaati){
        System.out.println(this.getAdSoyad()+" çalismaya "+ cSaati+" başladı.");
    }
}
