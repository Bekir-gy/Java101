public class GuvenlikGorevlisi extends  Memur{
    String belge;

    public GuvenlikGorevlisi(String adiSosyadi, String Telefon, String mail, String departman, String mesai, String belge){
        super(adiSosyadi,Telefon,mail,departman,mesai);
        this.belge=belge;
    }

    public String getBelge(){
        return this.belge;
    }

    public void setBelge(String belge){
        this.belge=belge;
    }

    public void Nobet(){
        System.out.println(this.getAdSoyad()+" NOBETE BAŞLADI MESAİ SAATİ:"+this.getMesai());
    }

    public void calisAbstraction(String cSaati){
        System.out.println(this.getAdSoyad() +" calismaya saat "+cSaati+" başladı.");
    }
}
