import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private String capturePrintOutput(Runnable r) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        try {
            r.run();
        } catch (Exception e) {
            fail("printStudent() threw an exception: " + e.getMessage());
        } finally {
            System.setOut(originalOut);
        }
        return out.toString();
    }

    @Test
    public void testPrintCSStudentIncludesFavoriteLanguage() {
        String randomLang = UUID.randomUUID().toString().substring(0, 8);

        CSStudent cs = new CSStudent(new Name("Alice", "Wonderland"), randomLang);
        cs.setCoursesList(new Course[]{
                new Course("courseName", "CSC 215", 4, new Name("fName", "lName")),
                new Course("courseName", "MATH 225", 3, new Name("fName", "lName")),
                new Course("courseName", "ANTH 100", 3, new Name("fName", "lName"))
        });

        String output = capturePrintOutput(() -> Main.printStudent(cs)).toLowerCase();
        assertTrue(output.contains("favorite language") && output.contains(randomLang),
                "Expected favorite language to be printed for CSStudent.");
    }

    @Test
    public void testPrintStudentOmitsFavoriteLanguage() {
        Student s = new Student(new Name("Bob", "McKendrick"));
        s.setCoursesList(new Course[]{
                new Course("courseName", "ROK 193", 3, new Name("fName", "lName")),
                new Course("courseName", "ART 221", 3, new Name("fName", "lName"))
        });

        String output = capturePrintOutput(() -> Main.printStudent(s));
        assertFalse(output.contains("Favorite language"),
                "Favorite language should not be printed for non-CSStudent.");
    }

}
