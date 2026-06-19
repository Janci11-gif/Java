class Seat {
    int seatNumber;
    
    Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    void bookSeat() {
        System.out.println("Seat " + seatNumber + " booked");
    }
}

class RegularSeat extends Seat {
    RegularSeat(int seatNumber) {
        super(seatNumber);
    }
    
    void bookSeat() {
        System.out.println("Regular seat " + seatNumber + " booked - no extra charges");
    }
}

class PremiumSeat extends Seat {
    PremiumSeat(int seatNumber) {
        super(seatNumber);
    }
    
    void bookSeat() {
        System.out.println("Premium seat " + seatNumber + " booked - includes snacks and luxury tax");
    }
}

public class TheaterBooking {
    public static void main(String[] args) {
        Seat seat1 = new RegularSeat(12);
        Seat seat2 = new PremiumSeat(5);
        
        seat1.bookSeat();
        seat2.bookSeat();
    }
}
