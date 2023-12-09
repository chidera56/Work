import java.util.ArrayList;

public class Organizer {
    private String name;
    private String studentId;
    private ArrayList<Event> events;
    public Object loggedInStudent;

    public Organizer(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.events = new ArrayList<>();
    }

    public Organizer() {
    }

    public void addEvent(Event onlineEvent, Event physicalEvent, Organizer loggedInOrganizer) {
        if (loggedInOrganizer == this) {
            events.add(onlineEvent);
            events.add(physicalEvent);
        } else {
            System.out.println("Error: You are not authorized to create events.");
        }
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void loggedInStudent(Organizer addEvent) {
        
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void add(Organizer organizer) {
    }

    public void removeEvent(Event event) {
    }

    public void addBooking(Booking newBooking) {
    }

    public void removeBooking(Booking booking) {
    }
}
