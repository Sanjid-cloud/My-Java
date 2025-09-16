// File: BookingSystem.java
// Purpose: Application class with a simple menu, no extra validation.

import java.util.ArrayList;
import java.util.Scanner;

class BookingSystem {
    public static void main(String[] args) {
        ArrayList<MovieTicket> tickets = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        while (choice != 6) {
            // --- Menu ---
            System.out.println("\n--- Movie Ticket Booking ---");
            System.out.println("1. Create Ticket");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Display Ticket Details");
            System.out.println("5. Show Available Seats");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            if (choice == 1) {
                // --- Create Ticket ---
                System.out.print("Enter movie name: ");
                String name = sc.next();
                System.out.print("Enter show time: ");
                String time = sc.next();
                System.out.print("Enter available seats: ");
                int seats = sc.nextInt();

                System.out.println("1. Normal Ticket  2. Group Ticket  3. Student Ticket");
                int type = sc.nextInt();

                MovieTicket ticket;
                if (type == 1) {
                    ticket = new MovieTicket(name, time, seats);
                } else if (type == 2) {
                    ticket = new GroupMovieTicket(name, time, seats);
                } else {
                    System.out.print("Enter student ID: ");
                    String id = sc.next();
                    ticket = new StudentMovieTicket(name, time, seats, id);
                }

                tickets.add(ticket);
                System.out.println("Ticket created.");

            } else if (choice == 2) {
                // --- Book Ticket ---
                for (int i = 0; i < tickets.size(); i++) {
                    System.out.print(i + ": ");
                    tickets.get(i).display();
                }
                System.out.print("Select ticket index: ");
                int idx = sc.nextInt();
                System.out.print("Enter number of tickets: ");
                int num = sc.nextInt();
                tickets.get(idx).bookTickets(num);

            } else if (choice == 3) {
                // --- Cancel Ticket ---
                for (int i = 0; i < tickets.size(); i++) {
                    System.out.print(i + ": ");
                    tickets.get(i).display();
                }
                System.out.print("Select ticket index: ");
                int idx = sc.nextInt();
                System.out.print("Enter number of tickets to cancel: ");
                int num = sc.nextInt();
                tickets.get(idx).cancelTickets(num);

            } else if (choice == 4) {
                // --- Display All Tickets ---
                for (MovieTicket t : tickets) {
                    t.display();
                }

            } else if (choice == 5) {
                // --- Show Available Seats ---
                for (int i = 0; i < tickets.size(); i++) {
                    System.out.println("Ticket " + i + " Available Seats: " + tickets.get(i).getAvailableSeats());
                }

            } else if (choice == 6) {
                System.out.println("Exiting system...");
            }
        }

        sc.close();
    }
}
