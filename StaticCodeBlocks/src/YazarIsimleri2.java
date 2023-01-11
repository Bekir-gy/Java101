public class YazarIsimleri2 {
    private static Yazar2 [] yazarlar;
    static {
        yazarlar=new Yazar2[2];
        yazarlar[0]= new Yazar2("YAZAR1","ESER1");
        yazarlar[1]=new Yazar2("yAZAR2","ESER2");
        //bu şekilde olmasının nedeni normalde Yazar2 yazarlar diye sınıftan nesne oluşturup
        //sonrasında yazarlar=new Yazar2("yazar3","eser3"); diye nesneye atama yapabilirdik
        //ama her yeni özellik eklemek gerektiğinde sürekli farklı nesne oluşturmamız gerekecekti
        // yazarlar2 yazarlar3 şeklinde ve ayrıca yazdırmak gerekince ayrı ayrı sout oluşturup yazdıracaktık
        //ama bu şekilde sınıf dizisi şeklinde tanımlarsam tek nesne yeterli olacaktır
        //ve yazdırırken döngüyle tek sout kullanarak yazdırabiliriz

    }

    public Yazar2[] getYazarlar(){
        return YazarIsimleri2.yazarlar;
    }
}
