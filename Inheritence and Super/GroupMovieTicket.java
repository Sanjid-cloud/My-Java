// File: GroupMovieTicket.java
// Purpose: A ticket type that shows a "group discount" message when booking 5+ tickets.

class GroupMovieTicket extends MovieTicket {

    // Forward all common values to parent via super(...)
    GroupMovieTicket(String movieName, String showTime, int availableSeats) {
        super(movieName, showTime, availableSeats);
    }

    // Override to add behavior (polymorphism in action)
    @Override
    public void bookTickets(int numberOfTickets) {
        // First, perform the normal booking logic from the parent
        super.bookTickets(numberOfTickets);

        // Extra feature: print message only when booking >= 5
        if (numberOfTickets >= 5) {
            System.out.println("Group discount applied!");
        }
    }
}
