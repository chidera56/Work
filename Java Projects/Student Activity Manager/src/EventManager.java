import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Student> students;
    private List<Event> events;
    Organizer loggedInStudent;

    public EventManager() {
        this.students = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public void registerStudent(String name, String studentId) {
        students.add(new Student(name, studentId));
    }

    public void registerOrganizer(String name, String studentId) {
        Organizer organizer = new Organizer(name, studentId);
        organizer.add(organizer);
    }

    public void login(String studentId) {
        // Check if the studentId exists in the registered students
        boolean found = false;
        Student[] students = new Student[100];

        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
        }
        for (Student student : students) {
            if (student != null && student.getStudentId() == studentId) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Error: Student with ID " + studentId + " is not registered.");
        }
    }
    
    public void createEvent(String title, String description, boolean isOnline, String url, String organization, String location, LocalDateTime startDateTime, LocalDateTime endDateTime, int maxParticipants, boolean requiresBooking) {
    
        if (isOnline) {
            Event onlineEvent = new Event(title, description, requiresBooking, url, location, location, startDateTime, endDateTime, maxParticipants, requiresBooking, null);
            events.add(onlineEvent);
        } else {
            Event physicalEvent = new Event(title, description, requiresBooking, organization, location, location, startDateTime, endDateTime, maxParticipants, requiresBooking, null);
            events.add(physicalEvent);
        }
        /*if (loggedInStudent instanceof Organizer) {
            Organizer organizer = (Organizer) loggedInStudent;
            organizer.addEvent(onlineEvent, physicalEvent);
            events.add(onlineEvent);
            events.add(physicalEvent);
        } else {
            System.out.println("Error: You are not authorized to create events.");
        }*/
    }
    
    public void cancelEvent(Event event) {
        if (loggedInStudent instanceof Organizer) {
            Organizer organizer = (Organizer) loggedInStudent;
            if (organizer.getEvents().contains(event)) {
                events.remove(event);
                organizer.removeEvent(event);
                for (Booking booking : event.getBookings()) {
                    booking.getStudent().removeBooking(booking);
                }
            } else {
                System.out.println("Error: You are not authorized to cancel this event.");
            }
        } else {
            System.out.println("Error: You are not authorized to cancel events.");
        }
    }
    
    public void viewAllEvents() {
        for (Event event : events) {
            System.out.println(event.toString());
        }
    }
    
    public void bookEvent(String eventID, String studentIdForBooking) {
        Event event = new Event();
        if (loggedInStudent != null) {
            if (event.requiresBooking()) {
                if (event.getBookings().length < event.getMaxParticipants()) {
                    Booking newBooking = new Booking(loggedInStudent, event);
                    loggedInStudent.addBooking(newBooking);
                    event.addBooking(newBooking);
                    System.out.println("You have successfully booked the event " + event.getTitle() + ".");
                } else {
                    System.out.println("Error: The event " + event.getTitle() + " has reached maximum capacity.");
                }
            } else {
                System.out.println("Error: The event " + event.getTitle() + " does not require booking.");
            }
        } else {
            System.out.println("Error: You need to be logged in to book an event.");
        }
    }
    
    public void cancelBooking(Booking booking) {
        if (loggedInStudent != null) {
            if (booking.getStudent().equals(loggedInStudent)) {
                Event event = booking.getEvent();
                event.removeBooking(booking);
                loggedInStudent.removeBooking(booking);
                System.out.println("You have successfully cancelled your booking for the event " + event.getTitle() + ".");
            } else {
                System.out.println("Error: You are not authorized to cancel this booking.");
            }
        } else {
            System.out.println("Error: You need to be logged in to cancel a booking.");
        }
    }

    public void viewBookings(String studentId) {
        System.out.println("Your bookings:");
        List<Booking> bookings = Booking.getBookingsByStudentId(studentId);
        if (bookings.isEmpty()) {
            System.out.println("You have no bookings.");
        } else {
            System.out.println(String.format("%-10s%-30s%-30s%-20s", "ID", "Event Title", "Date and Time", "Location"));
            for (Booking booking : bookings) {
                Event event = EventManager.getEventById(booking.getEventId());
                System.out.println(String.format("%-10s%-30s%-30s%-20s", booking.getEventId(), event.getTitle(), 
                    event.getStartDateTime(), event.getLocation()));
            }
        }
    }
    
    public void cancelBooking(String bookingId) {
        Booking booking = Booking.getBookingById(bookingId);
        if (booking == null) {
            System.out.println("Booking not found.");
        } else {
            Event event = EventManager.getEventById(booking.getEventId());
            Booking.cancelBooking(bookingId);
            EventManager.increaseAvailableSlots(event.getEventId(), 1);
            System.out.println("Booking cancelled.");
        }
    }
    
    private static void increaseAvailableSlots(Object eventId, int i) {
    }

    public void cancelEvent(String eventId) {
        Event event = EventManager.getEventById(eventId);
        if (event == null) {
            System.out.println("Event not found.");
        } else {
            cancelEvent(eventId);
            List<Booking> bookings = Booking.getBookingsByEventId(eventId);
            for (Booking booking : bookings) {
                Booking.cancelBooking(booking.getEventId());
            }
            System.out.println("Event cancelled and bookings associated with it have been cancelled.");
        }
    }
    
    public static Event getEventById(String eventId) {
        return null;
    }

    public void changeEventDetails(String eventId, String title, String description, String location, 
            String dateTime, String url, String organization) {
        Event event = EventManager.getEventById(eventId);
        if (event == null) {
            System.out.println("Event not found.");
        } else {
            EventManager.updateEventDetails(eventId, title, description, location, dateTime, url, organization);
            System.out.println("Event details updated.");
        }
    }

    private static void updateEventDetails(String eventId, String title, String description, String location,
            String dateTime, String url, String organization) {
    }

    public void viewOrganizerEvents(String organizerIdForCancellation) {

    }

    public void postEvent(String title, String description, String location, String dateTime, int spots,
            boolean bookingRequired, String organizerIdForPosting) {

    }

    public boolean checkOrganizer(String organizerIdForPosting) {
        return false;
    }
    
}
