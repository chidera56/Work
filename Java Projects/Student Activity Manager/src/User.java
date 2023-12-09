public class User {
    private String name;
    private String studentId;
    private boolean isOrganizer;

    public User(String name, String studentId, boolean isOrganizer) {
        this.name = name;
        this.studentId = studentId;
        this.isOrganizer = isOrganizer;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public boolean isOrganizer() {
        return isOrganizer;
    }
}
