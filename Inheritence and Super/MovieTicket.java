// File: MovieTicket.java
// Purpose: Base class that holds common ticket data and behavior.
// Note: Fields use default (package-private) access; methods are public as per rubric.

class MovieTicket {
    // ---- Attributes (no encapsulation on purpose) ----
    String movieName;
    String showTime;
    int availableSeats;

    // ---- Constructor: initialize all attributes at once ----
    MovieTicket(String movieName, String showTime, int availableSeats) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.availableSeats = availableSeats;
    }

    // ---- Book tickets if seats are enough; prevent overbooking ----
    public void bookTickets(int numberOfTickets) {
        if (numberOfTickets <= 0) {
            System.out.println("Invalid number of tickets.");
            return;
        }
        if (availableSeats >= numberOfTickets) {
            availableSeats -= numberOfTickets; // deduct seats
            System.out.println(numberOfTickets + " tickets booked for " + movieName + " (" + showTime + ").");
        } else {
            System.out.println("Not enough seats. Available: " + availableSeats);
        }
    }

    // ---- Cancel tickets: simply add seats back ----
    public void cancelTickets(int numberOfTickets) {
        if (numberOfTickets <= 0) {
            System.out.println("Invalid number of tickets.");
            return;
        }
        availableSeats += numberOfTickets;
        System.out.println(numberOfTickets + " tickets canceled for " + movieName + ".");
    }

    // ---- Getter required by rubric ----
    public int getAvailableSeats() {
        return availableSeats;
    }

    // ---- Display movie info ----
    public void display() {
        System.out.println("Movie: " + movieName + " | Show: " + showTime + " | Seats: " + availableSeats);
    }
}
