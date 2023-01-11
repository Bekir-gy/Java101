public abstract class Calisan {
        private String adSoyad;
        private  String Telefon;
        private  String mail;

        public Calisan(String adSoyad,String Telefon,String mail){
            this.adSoyad=adSoyad;
            this.Telefon=Telefon;
            this.mail=mail;
        }
        public String getAdSoyad(){
            return this.adSoyad;
        }
        public void setAdSoyad(String adSoyad){
            this.adSoyad=adSoyad;
        }
        public String getTelefon(){
            return this.Telefon;
        }
        public void setTelefon(){
            this.Telefon=Telefon;
        }
        public  String getMail(){
            return this.mail;
        }
        public void setMail(String mail){
            this.mail=mail;
        }

        public void giris(){
            System.out.println(this.adSoyad+" Giriş yaptı");
        }
        public void cikis(){
            System.out.println(this.adSoyad+" Çıkış yaptı");
        }
        public void yemekhane(){
            System.out.println(this.adSoyad+" Yemekhaneye giriş yaptı");
        }

        public static void giriss(Calisan [] user){
            for (Calisan c:user){
                c.giris();
            }
                     /* for (int i=0;i< user.length;i++){
                        //Calisan c=user[i];
                        //c.giris();
                        user[i].giris();
                        }*/
        }


}
