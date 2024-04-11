public class Course {

    String courseName;
    String courseCode;
    int units;
    Name instructor;

    public Course(String courseName, String courseCode, int units, Name instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.units = units;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public Name getInstructor() {
        return instructor;
    }

    public void setInstructor(Name instructor) {
        this.instructor = instructor;
    }
}
