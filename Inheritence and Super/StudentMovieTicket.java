// File: StudentMovieTicket.java
// Purpose: Ticket type for students; stores studentID and prints a discount message on booking.

class StudentMovieTicket extends MovieTicket {
    // Extra attribute for this subclass
    String studentID;

    // Call parent constructor for shared fields + set studentID here
    StudentMovieTicket(String movieName, String showTime, int availableSeats, String studentID) {
        super(movieName, showTime, availableSeats);
        this.studentID = studentID;
    }

    // Override to add a "student discount" note
    @Override
    public void bookTickets(int numberOfTickets) {
        super.bookTickets(numberOfTickets);
        System.out.println("Student discount applied for ID: " + studentID);
    }

    // Override display to include the studentID
    @Override
    public void display() {
        System.out.println(
            "Movie: " + movieName + " | Show: " + showTime +
            " | Seats: " + availableSeats + " | Student ID: " + studentID
        );
    }
}
