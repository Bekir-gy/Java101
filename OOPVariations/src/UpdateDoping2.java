public class UpdateDoping2  extends Doping2{
    public UpdateDoping2(double price,double[] taxes){
        super.setPrice(price);
        super.setTaxes(taxes);
    }

    public double TaxesCalculate(){
        double total=0;
        for (int i=0; i<super.getTaxes().length;i++){
            total+=super.getTaxes()[i];
        }
        return total;
    }
    public double comisionRate(){
        return super.getPrice()*0.2;
    }



    @Override
    public double calculate(){
        return comisionRate()+TaxesCalculate();
    }
}
