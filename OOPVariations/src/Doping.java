public abstract class Doping {
    protected double[] taxes;
    protected double price;

    /*public Doping(double[] taxes,double price){
        this.taxes=taxes;
        this.price=price;
    }*/
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public double[] getTaxes() {
        return taxes;
    }

    public void setTaxes(double[] taxes) {
        this.taxes = taxes;
    }

    public abstract double calculate();



}
