public class Student {
    Name name;
    String major;
    int studentID;
    double gpa;
    Course[] coursesList;

    public Student(Name name, String major, int studentID, double gpa, Course[] coursesList) {
        this.name = name;
        this.major = major;
        this.studentID = studentID;
        this.gpa = gpa;
        this.coursesList = coursesList;
    }

    public Student(Name name) {
        this.name = name;
    }

    public Student() {

    }

    /**
     * 1 point for attempt. 2 points for correct implementation.
     * TODO: Get the number of units this student is taking.
     */
    public int getUnits() {
        // 1. set up a variable to keep track of the total
        // 2. loop through the courses the student is taking
        // 3. get the unit for each course
        // 4. inside the loop, increment our variable
        // 5. outside, we return the total
        return 0;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Course[] getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(Course[] coursesList) {
        this.coursesList = coursesList;
    }
}