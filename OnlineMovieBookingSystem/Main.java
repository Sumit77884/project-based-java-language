public class Main {
    public static void main(String[] args) {

        Seat seat1 = new Seat(101);

        User u1 = new User("Sumit");
        User u2 = new User("Rahul");

        seat1.addObserver(u1);
        seat1.addObserver(u2);

        Payment payment = PaymentFactory.getPayment("UPI");

        Booking booking = new Booking(seat1, payment);
        booking.confirmBooking(250.0);
    }
}
