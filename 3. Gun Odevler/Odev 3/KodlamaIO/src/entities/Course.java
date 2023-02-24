package entities;

public class Course {

    private int courseId;
    private String courseName;
    private String courseDetail;
    private double coursePrice;

    public Course() {
    }

    public Course(int courseId, String courseName, String courseDetail, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDetail = courseDetail;
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDetail() {
        return courseDetail;
    }

    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDetail='" + courseDetail + '\'' +
                ", coursePrice=" + coursePrice +
                '}';
    }
}
