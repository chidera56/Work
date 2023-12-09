import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EventManager manager = new EventManager();
        EventManager lgn = new EventManager();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean quit = false;
            while (!quit) {
                System.out.println("\nWelcome to the University Event Manager. Please select an option:");
                System.out.println("1. Register as a student");
                System.out.println("2. Login as a student");
                System.out.println("3. Register as an event organizer");
                System.out.println("4. View all events");
                System.out.println("5. View your bookings");
                System.out.println("6. Book an event");
                System.out.println("7. Cancel a booking");
                System.out.println("8. Cancel an event");
                System.out.println("9. Post an event");
                System.out.println("10. Change event details");
                System.out.println("11. Quit");
   
                int choice = scanner.nextInt();
                scanner.nextLine();
   
                switch (choice) {
                    //Register as a student.
                    case 1:
                        System.out.println("Please enter your name:");
                        String studentName = scanner.nextLine();
                        System.out.println("Please enter your student ID:");
                        String studentId = scanner.nextLine();
                        manager.registerStudent(studentName, studentId);
                        System.out.println("You have been registered as a student.");
                        break;
                    //Login as a student.
                    case 2:
                        System.out.println("Enter your student ID:");
                        studentId = scanner.nextLine();
                        lgn.login(studentId);
                    //Register as an organizer.
                    case 3:
                        System.out.println("Please enter your name:");
                        String name = scanner.nextLine();
                        System.out.println("Please enter your student ID:");
                        String studentOrganizerId = scanner.nextLine();
                        manager.registerOrganizer(name, studentOrganizerId);
                        System.out.println("You have been registered as an organizer.");
                        break;
                    //View all events.
                    case 4:
                        manager.viewAllEvents();
                        break;
                    case 5:
                        System.out.println("Please enter your student ID:");
                        String bookingsId = scanner.nextLine();
                        manager.viewBookings(bookingsId);
                        break;
                    case 6:
                        System.out.println("Please enter the event ID you would like to book:");
                        String eventId = scanner.toString();
                        scanner.nextLine();
                        System.out.println("Please enter your student ID:");
                        String studentIdForBooking = scanner.nextLine();
                        manager.bookEvent(eventId, studentIdForBooking);
                        break;
                    case 7:
                        System.out.println("Please enter your student ID:");
                        String cancellationId = scanner.nextLine();
                        manager.viewBookings(cancellationId);
                        System.out.println("Please enter the booking ID you would like to cancel:");
                        String bookingId = scanner.toString();
                        scanner.nextLine();
                        manager.cancelBooking(bookingId);
                        break;
                    case 8:
                        System.out.println("Please enter your organizer ID:");
                        String organizerIdForCancellation = scanner.nextLine();
                        manager.viewOrganizerEvents(organizerIdForCancellation);
                        System.out.println("Please enter the event ID you would like to cancel:");
                        String eventToCancel = scanner.toString();
                        scanner.nextLine();
                        manager.cancelEvent(eventToCancel);
                        break;
                    case 9:
                        System.out.println("Please enter your organizer ID:");
                        String organizerIdForPosting = scanner.nextLine();

                        if(manager.checkOrganizer(organizerIdForPosting)) {
                            System.out.println("Please enter the title of the event:");
                            String title = scanner.nextLine();
                            System.out.println("Please enter a description of the event:");
                            String description = scanner.nextLine();
                            System.out.println("Is the event online or physical? (O/P)");
                            String locationType = scanner.nextLine();
                            String location = "";
                        if (locationType.equalsIgnoreCase("O")) {
                            System.out.println("Please enter the URL for the online event:");
                            location = scanner.nextLine();
                        } else if (locationType.equalsIgnoreCase("P")) {
                            System.out.println("Please enter the campus where the event is taking place:");
                            String campus = scanner.nextLine();
                            System.out.println("Please enter the room number of the event:");
                            String room = scanner.nextLine();
                            location = campus + ", Room " + room;
                        }
                        System.out.println("Please enter the date and time of the event (dd/mm/yyyy hh:mm):");
                        String dateTime = scanner.nextLine();

                        System.out.println("Please enter the number of available spots for the event:");
                        int spots = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Does the event require a booking? (Y/N)");
                        String bookingRequiredInput = scanner.nextLine();
                        boolean bookingRequired = false;
                        if (bookingRequiredInput.equalsIgnoreCase("Y")) {
                            bookingRequired = true;
                        }
                        manager.postEvent(title, description, location, dateTime, spots, bookingRequired, organizerIdForPosting);
                        System.out.println("Event posted successfully.");
                        } else {
                        System.out.println("You are not registered as an organizer.");
                        }
                        break;
                    // Change event details
                    case 10:
                        Organizer organizer = new Organizer();
                        System.out.println("Please enter the ID of the event you want to change:");
                        eventId = scanner.nextLine();
                        Event eventToChange = EventManager.getEventById(eventId);
                        if (eventToChange == null) {
                            System.out.println("Event not found.");
                            break;
                        }
                        if (!(eventToChange.getOrganizer().equals(organizer.loggedInStudent))) {
                            System.out.println("You do not have permission to change this event.");
                            break;
                        }
                        System.out.println("Please enter the new date and time of the event (YYYY-MM-DD HH:MM):");
                        String newDateTime = scanner.nextLine();
                        try {
                            LocalDateTime newEventDateTime = LocalDateTime.parse(newDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                            eventToChange.setDateTime(newEventDateTime);
                            System.out.println("Event details updated.");
                        } catch (DateTimeParseException e) {
                            System.out.println("Invalid date and time format.");
                        }
                        break;
                    // Quit
                    case 11:
                        System.out.println("Goodbye!");
                        quit = true;
                       break;
                }       
            }
        }           
    }
}





/*public static void main(String[] args) {
    StudentLedActivitiesManager manager = new StudentLedActivitiesManager();
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    while (!quit) {
        System.out.println("Enter 1 to register, 2 to login, or 3 to quit.");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        switch (choice) {
            case 1:
                System.out.println("Enter your name:");
                String name = scanner.nextLine();
                System.out.println("Enter your student ID:");
                String studentId = scanner.nextLine();
                manager.registerStudent(name, studentId);
                break;
            case 2:
                System.out.println("Enter your student ID:");
                String id = scanner.nextLine();
                System.out.println("Enter your password:");
                String password = scanner.nextLine();
                boolean loginSuccessful = manager.login(id, password);
                if (loginSuccessful) {
                    System.out.println("Login successful.");
                    boolean loggedIn = true;
                    while (loggedIn) {
                        System.out.println("Enter 1 to view all events, 2 to view upcoming events, 3 to view your bookings, 4 to register as an organizer, 5 to post an event, 6 to cancel an event, 7 to unregister as an organizer, or 8 to logout.");
                        int loggedInChoice = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        switch (loggedInChoice) {
                            case 1:
                                manager.displayAllEvents();
                                break;
                            case 2:
                                manager.displayUpcomingEvents();
                                break;
                            case 3:
                                manager.viewBookings(id);
                                break;
                            case 4:
                                manager.registerOrganizer(manager.getStudentById(id).getName(), id);
                                break;
                            case 5:
                                manager.postEvent(id);
                                break;
                            case 6:
                                manager.cancelEvent(id);
                                break;
                            case 7:
                                manager.unregisterOrganizer(id);
                                break;
                            case 8:
                                loggedIn = false;
                                break;
                            default:
                                System.out.println("Invalid input. Please try again.");
                                break;
                        }
                    }
                } else {
                    System.out.println("Login failed. Incorrect student ID or password.");
                }
                break;
            case 3:
                quit = true;
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }
    }
    scanner.close();
    System.out.println("Program terminated.");*/