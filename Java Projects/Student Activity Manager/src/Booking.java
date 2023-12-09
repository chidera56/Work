import java.time.LocalDate;
import java.util.List;

public class Booking {
    private Event event;
    private Student student;
    private LocalDate bookingDate;
    
    public Booking(Event event, Student student, LocalDate bookingDate) {
        this.event = event;
        this.student = student;
        this.bookingDate = bookingDate;
    }
    
    public Booking(Organizer loggedInStudent, Event event2) {
    }

    public Event getEvent() {
        return event;
    }
    
    public Student getStudent() {
        return student;
    }
    
    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public String getEventId() {
        return null;
    }

    public static List<Booking> getBookingsByEventId(String eventId) {
        return null;
    }

    public static void cancelBooking(String eventId) {
    }

    public static Booking getBookingById(String bookingId) {
        return null;
    }

    public static List<Booking> getBookingsByStudentId(String studentId) {
        return null;
    }
}
