class Ticket {
    int ticketNumber;
    double price;
    
    Ticket(int ticketNumber, double price) {
        this.ticketNumber = ticketNumber;
        this.price = price;
    }
    
    void generateTicket() {
        System.out.println("Ticket #" + ticketNumber + " - $" + price);
    }
}

class BusTicket extends Ticket {
    String seatNumber;
    
    BusTicket(int ticketNumber, double price, String seatNumber) {
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }
    
    void generateTicket() {
        System.out.println("Bus Ticket #" + ticketNumber + " - Seat: " + seatNumber);
    }
}

class TrainTicket extends Ticket {
    String coachType;
    
    TrainTicket(int ticketNumber, double price, String coachType) {
        super(ticketNumber, price);
        this.coachType = coachType;
    }
    
    void generateTicket() {
        System.out.println("Train Ticket #" + ticketNumber + " - " + coachType + " coach");
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        Ticket[] tickets = {
            new BusTicket(1001, 25.50, "A12"),
            new TrainTicket(2002, 45.00, "First Class")
        };
        
        for(Ticket t : tickets) {
            t.generateTicket();
        }
    }
}
