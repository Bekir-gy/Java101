public class UpdateDoping extends Doping{
    public UpdateDoping(double[] taxes,double price){
        super.setPrice(price);
        super.setTaxes(taxes);
    }

    public double taxesCalculate(){
        double total=0;
        for (int i=0;i<super.getTaxes().length;i++){
            total+=super.getTaxes()[i];
        }
        return total;
    }

    public double comisionRate(){
        return super.getPrice()*0.2;
    }

    @Override
    public double calculate(){
        return comisionRate()+taxesCalculate();
    }

}
