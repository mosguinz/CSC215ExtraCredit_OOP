public class Main {
    public static void main(String[] args) {
        // Here's two students, one that is a `CSStudent` and another that is just a `Student`.

        // Notice, "Alice" is of `CSStudent` type.
        CSStudent stu1 = new CSStudent(new Name("Alice", "Wonderland"), "Java");
        Course[] stu1_courses = new Course[3];
        stu1_courses[0] = new Course("Intermediate Computer Programming", "CSC 215", 4, new Name("Duc", "Ta"));
        stu1_courses[1] = new Course("Introduction to Linear Algebra", "MATH 225", 3, new Name("Shidong", "Li"));
        stu1_courses[2] = new Course("Introduction to Biological Anthropology", "ANTH 100", 3, new Name("Mark", "Griffin"));
        stu1.setCoursesList(stu1_courses);

        // Bob, on the other hand, is just a regular `Student`.
        Student stu2 = new Student(new Name("Bob", "McKendrick"));
        Course[] stu2Courses = new Course[2];
        stu2Courses[0] = new Course("Looking at a bunch o' Rocks", "ROK 193", 3, new Name("Brock", "Boulderson"));
        stu2Courses[1] = new Course("Introduction to Pottery", "ART 221", 3, new Name("Clay", "Vaseman"));
        stu2.setCoursesList(stu2Courses);

        printStudent(stu1);
        System.out.println("----------------------");
        printStudent(stu2);

    }

    /**
     * 1 point for attempt. 3 points for correct implementation.
     * TODO: Modify this method so it displays their favorite language
     *       after the name if they are a `CSStudent`.
     */
    public static void printStudent(Student student) {
        Name name = student.getName();
        Course[] courses = student.getCoursesList();
        System.out.printf("Name: %s %s\n", name.firstName, name.lastName);

        /* Add code here. */
        if (student instanceof CSStudent) {
            CSStudent csStudent = (CSStudent) student;
            System.out.printf("Favorite Language: %s\n", csStudent.getFavoriteLanguage());
        }

        for (Course c : courses) {
            System.out.printf("%-10s Units: %2d\n", c.getCourseCode(), c.getUnits());
        }
        System.out.printf("Total units:      %2d\n", student.getUnits());
    }
}