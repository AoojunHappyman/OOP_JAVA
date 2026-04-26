abstract class TrainTicket {
    protected String passengerName;
    protected double baseFare;

    public TrainTicket(String passengerName, double baseFare) {
        if (baseFare <= 0) {
            throw new IllegalArgumentException("Invalid base fare: " + baseFare);
        }
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }

    public abstract double getFinalPrice();
}

class RegularTicket extends TrainTicket {
    public RegularTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double getFinalPrice() {
        return baseFare;
    }
}

class StudentTicket extends TrainTicket {
    public StudentTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double getFinalPrice() {
        return baseFare * 0.8;
    }
}

public class Main {
    public static void main(String[] args) {
        Object[][] ticketData = {
            {"Regular", "Alice",   100.0},
            {"Student", "Bob",     100.0},
            {"Regular", "Charlie", -120.0}
        };

        for (Object[] data : ticketData) {
            try {
                String type = (String) data[0];
                String name = (String) data[1];
                double fare = (double) data[2];

                TrainTicket ticket;
                if (type.equals("Student")) {
                    ticket = new StudentTicket(name, fare);
                } else {
                    ticket = new RegularTicket(name, fare);
                }

                System.out.println("Passenger: " + ticket.passengerName
                        + " → " + ticket.getFinalPrice() + " Baht");

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
