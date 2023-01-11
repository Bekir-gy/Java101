public interface IBanka {
    final String ipAdress="127.0.0.1";
    boolean connect(String ip);
    boolean payment(double price,String cardNumber,String Date,String cvc);
}
