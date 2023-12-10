import java.time.LocalDate;

// Date.java
public class Date {
    private LocalDate date;

    public Date(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public Date() {
        this.date = LocalDate.now(); // or initialize with a specific date
    }

    @Override
    public String toString() {
        return date.toString();
    }
}