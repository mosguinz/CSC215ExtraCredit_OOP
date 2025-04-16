import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

public class StudentTest {

    @Test
    public void testGetUnitsSum() {
        Random rand = new Random();
        Course[] courses = new Course[5];
        int expectedSum = 0;

        for (int i = 0; i < 5; i++) {
            int units = rand.nextInt(5) + 1;
            courses[i] = new Course("courseName", "courseCode", units, new Name("fName", "lName"));
            expectedSum += units;
        }

        Student student = new Student();
        student.coursesList = courses;

        assertEquals(expectedSum, student.getUnits(), "Total units should match the sum of all course units.");
    }
}
