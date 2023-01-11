public class Kitap {
    private String KitapAdi;
    private String Yazar;
    private int sayfaSayisi;

    public Kitap(String KitapAdi, String Yazar, int sayfaSayisi){
        this.KitapAdi=KitapAdi;
        this.Yazar=Yazar;
        if (sayfaSayisi<0){
            this.sayfaSayisi=10;
            System.out.println("SAYFA NEGATİF OLMAZ");
        }else
            this.sayfaSayisi=sayfaSayisi;
    }
        public String getKitapAdi(){
            return this.KitapAdi;
        }
        public void setKitapAdi(String KitapAdi){
        this.KitapAdi=KitapAdi;
        }

        public String getYazar(){
            return this.Yazar;
        }
        public void setYazar (String Yazar){
            this.Yazar=Yazar;
        }
        public int getSayfaSayisi(){
            return this.sayfaSayisi;
        }
        public void setSayfaSayisi(int sayfaSayisi){
            if (sayfaSayisi<0){
                this.sayfaSayisi=15;
                System.out.println("Negatif olmaz");
            }else
               this.sayfaSayisi=sayfaSayisi;
        }

        void yazdir(){
            System.out.println(this.KitapAdi+" "+this.Yazar+" "+this.sayfaSayisi);
        }


}
/*
 private String KitapAdi;
     private String Yazar;
     private int sayfaSayisi;




    public  Kitap(String KitapAdi,String Yazar,int sayfaSayisi){
        this.KitapAdi=KitapAdi;
        this.Yazar=Yazar;
        if (sayfaSayisi<0){
            this.sayfaSayisi=10;
            System.out.println("Sayfa negatif olmaz");
        }else
            this.sayfaSayisi=sayfaSayisi;
    }

    public String getKitapAdi(){
        return this.KitapAdi;
    }
    public void setKitapAdi(String KitapAdi){
        this.KitapAdi=KitapAdi;
    }
    public String getYazar(){
        return this.Yazar;
    }
    public void setYazar(String Yazar){
        this.Yazar=Yazar;
    }
    public int getSayfaSayisi(){
        return this.sayfaSayisi;
    }
    public  void setSayfaSayisi(int sayfaSayisi){
        if (sayfaSayisi<0){
            this.sayfaSayisi=10;
            System.out.println("NEgatif Olmaz");
        }else
            this.sayfaSayisi=sayfaSayisi;
    }

   void yazdir(){
        System.out.println(this.KitapAdi+" "+this.Yazar+" "+this.sayfaSayisi);
    }

 */