class Booking {
    private Seat seat;
    private Payment payment;

    public Booking(Seat seat, Payment payment) {
        this.seat = seat;
        this.payment = payment;
    }

    public void confirmBooking(double amount) {
        if (seat.isAvailable()) {
            seat.bookSeat();
            payment.pay(amount);
            System.out.println("Booking Confirmed!");
        } else {
            System.out.println("Seat not available!");
        }
    }
}
