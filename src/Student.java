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
        int totalUnits = 0;
        if (coursesList != null) {
            for (Course course : coursesList) {
                if (course.getUnits() > 0) {
                    totalUnits += course.getUnits();
                }
            }
        }
        return totalUnits;
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