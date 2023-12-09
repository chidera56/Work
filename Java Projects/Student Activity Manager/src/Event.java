//import java.time.LocalDate;
//import java.time.LocalTime;
//import javax.swing.event.DocumentEvent.EventType;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private String title;
    private String description;
    private boolean isOnline;
    private String url;
    private String organization;
    private String location;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private int maxParticipants;
    private boolean requiresBooking;
    private List<User> attendees;
    private User organizer;

    public Event(String title, String description, boolean isOnline, String url, String organization, String location, LocalDateTime startDateTime, LocalDateTime endDateTime, int maxParticipants, boolean requiresBooking, User organizer) {
        this.title = title;
        this.description = description;
        this.isOnline = isOnline;
        this.url = url;
        this.organization = organization;
        this.location = location;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.maxParticipants = maxParticipants;
        this.requiresBooking = requiresBooking;
        this.organizer = organizer;
        this.attendees = new ArrayList<>();
    }

    public Event() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public String getUrl() {
        return url;
    }

    public String getOrganization() {
        return organization;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public boolean requiresBooking() {
        return requiresBooking;
    }

    public List<User> getAttendees() {
        return attendees;
    }

    public User getOrganizer() {
        return organizer;
    }

    public void addAttendee(User user) {
        attendees.add(user);
    }

    public void removeAttendee(User user) {
        attendees.remove(user);
    }

    public Booking[] getBookings() {
        return null;
    }

    public void addBooking(Booking newBooking) {
    }

    public void removeBooking(Booking booking) {
    }

    public Object getEventId() {
        return null;
    }

    public void setDateTime(LocalDateTime newEventDateTime) {
    }
}





    /*private String title;
    private String description;
    private EventType eventType;
    private String location;
    private String url;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private int maxParticipants;
    private boolean bookingRequired;
    private Student organizer;
    
    public Event(String title, String description, EventType eventType, String location, String url, LocalDate date, LocalTime startTime, LocalTime endTime, int maxParticipants, boolean bookingRequired, Student organizer) {
        this.title = title;
        this.description = description;
        this.eventType = eventType;
        this.location = location;
        this.url = url;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.maxParticipants = maxParticipants;
        this.bookingRequired = bookingRequired;
        this.organizer = organizer;
    }

    public enum EventType {
        ONLINE,
        PHYSICAL
    }
    
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public EventType getEventType() {
        return eventType;
    }
    
    public String getLocation() {
        return location;
    }
    
    public String getUrl() {
        return url;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public LocalTime getStartTime() {
        return startTime;
    }
    
    public LocalTime getEndTime() {
        return endTime;
    }
    
    public int getMaxParticipants() {
        return maxParticipants;
    }
    
    public boolean isBookingRequired() {
        return bookingRequired;
    }
    
    public Student getOrganizer() {
        return organizer;
    }*/