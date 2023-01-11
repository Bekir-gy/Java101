public class ABankasi implements IBanka{
    private String bankaAdi;
    private  String terminalID;
    private  String password;

    public ABankasi(String bankaAdi, String terminalID, String password){
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
        return this.terminalID;
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

    public void connect(){
        System.out.println(this.bankaAdi+" bağlantı yapıldı.");
    }

    public void paid(double price, String cardNumber, String Date, String cvc){
        System.out.println("İşlem Başarılı oLDU.");
    }

    @Override
    public boolean connect(String ip){
        System.out.println("KULLANICI IP:"+ip);
        System.out.println("Makine IP:"+this.ipAdress);
        System.out.println("BAĞLANTI BAŞARILI");
        return true;
    }

    @Override
    public boolean payment(double price,String cardNumber, String Date, String cvc){
        System.out.println("ÖDEME YAPILDI.");
        return true;
    }

}
