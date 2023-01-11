public class BBankasi implements IBanka {
    private String bankaAdi;
    private String terminalID;
    private  String password;

    public BBankasi(String bankaAdi,String terminalID, String password){
        this.bankaAdi=bankaAdi;
        this.terminalID=terminalID;
        this.password=password;
    }

    public String getBankaAdi(){
        return this.bankaAdi;
    }
    public void setBankaAdi(String bankaAdi){
        this.bankaAdi=bankaAdi;
    }

    public String getTerminalID(){
        return  this.terminalID;
    }
    public void setTerminalID(String terminalID){
        this.terminalID=terminalID;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public  void con(String str){
        System.out.println(this.bankaAdi+" GİRİŞ BAŞARILI");
    }
    public void payment(double price){
        System.out.println("İşlem bAŞARILI");
    }

    @Override
    public boolean connect(String ip){
        System.out.println("Kullanıcı IP:"+ip);
        System.out.println("Makine ip:"+this.ipAdress);
        System.out.println("Bağlantı Başarılı");
        return true;
    }

    @Override
    public boolean payment(double price,String cardNumber, String Date, String cvc){
        System.out.println("Ödeme yapıldı.");
        return true;
    }
}
