import java.util.*;

class Seat {
    private int seatNumber;
    private boolean isBooked;
    private List<Observer> observers = new ArrayList<>();

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update("Seat " + seatNumber + " is now booked!");
        }
    }

    public void bookSeat() {
        if (!isBooked) {
            isBooked = true;
            notifyObservers();
        } else {
            System.out.println("Seat already booked!");
        }
    }

    public boolean isAvailable() {
        return !isBooked;
    }
}
