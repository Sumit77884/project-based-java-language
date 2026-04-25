class PaymentFactory {
    public static Payment getPayment(String type) {
        if (type.equalsIgnoreCase("CARD")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("UPI")) {
            return new UpiPayment();
        }
        return null;
    }
}
