public class YazarIsimleri {
    private  static Yazar[] yazarisimleri;
    static {
        yazarisimleri=new Yazar[5];
        yazarisimleri[0]=new Yazar("yazar1","eser1");
        yazarisimleri[1]=new Yazar("yazar2","eser2");
        yazarisimleri[2]=new Yazar("yazar3","eser3");
        yazarisimleri[3]=new Yazar("yazar4","eser4");
        yazarisimleri[4]=new Yazar("yazar5","eser5");

    }

    public static Yazar[] getYazarisimleri(){
        return YazarIsimleri.yazarisimleri;
    }

}
