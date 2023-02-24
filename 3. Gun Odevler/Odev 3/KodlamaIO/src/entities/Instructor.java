package entities;

public class Instructor {

    private int instructorId;
    private String instructorName;
    private String instructorSurname;

    public Instructor() {
    }

    public Instructor(int instructorId, String instructorName, String instructorSurname) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorSurname = instructorSurname;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorSurname() {
        return instructorSurname;
    }

    public void setInstructorSurname(String instructorSurname) {
        this.instructorSurname = instructorSurname;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorId=" + instructorId +
                ", instructorName='" + instructorName + '\'' +
                ", instructorSurname='" + instructorSurname + '\'' +
                '}';
    }
}
