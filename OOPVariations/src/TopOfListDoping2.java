public class TopOfListDoping2 extends Doping2{
    public TopOfListDoping2(double price){
        super.setPrice(price);
    }


    @Override
    public double calculate(){
        return super.getPrice()+super.getPrice()*0.35;
    }
}
