import org.example.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void testStudentCreation() {
        Student student = StudentGenerator.generateStudent();
        System.out.println(student);
        assertNotNull(student, "The student should not be null");
    }

    @Test
    public void testStudentsCreation() {
        int size = 10;
        ArrayList<Student> students = StudentGenerator.generateStudents(size);
        for (Student student : students) {
            System.out.println(student);
            assertNotNull(student, "The student should not be null");
        }
    }

    @Test
    public void testFilterFaculty() {
        int size = 100;
        String faculty = StudentData.faculties[ThreadLocalRandom.current().nextInt(StudentData.faculties.length)];
        ArrayList<Student> students = StudentGenerator.generateStudents(size);
        students = StudentHandle.filterFaculty(students, faculty);
        System.out.println(students);
        for (Student student : students) {
            assertEquals(faculty, student.getFaculty());
        }
    }

    @Test
    public void testSortCourse() {
        int size = 20;
        ArrayList<Student> students = StudentGenerator.generateStudents(size);
        students = StudentHandle.sortCourse(students);
        System.out.println(students);
        for (int i = 0; i < students.size() - 1; i++) {
            assertFalse(students.get(i).getCourse() > students.get(i + 1).getCourse());
        }
    }

    @Test
    public void testFilterOlder() {
        int year = 2005;
        ArrayList<Student> students = StudentGenerator.generateStudents(50);
        students = StudentHandle.filterOlder(students, year);
        System.out.println(students);
        for (Student student : students) {
            assertFalse(student.getBirthday().getYear() <= year);
        }
    }

    @Test
    public void testFilterCourse() {
        int size = 100;
        int course = ThreadLocalRandom.current().nextInt(StudentData.minCourse, StudentData.maxCourse + 1);
        ArrayList<Student> students = StudentGenerator.generateStudents(size);
        students = StudentHandle.filterCourse(students, course);
        System.out.println(students);
        for (Student student : students) {
            assertEquals(course, student.getCourse());
        }
    }

    @Test
    public void testFilterGroup() {
        int size = 100;
        int group = ThreadLocalRandom.current().nextInt(StudentData.minGroup, StudentData.maxGroup + 1);
        ArrayList<Student> students = StudentGenerator.generateStudents(size);
        ArrayList<Student> filteredStudents = StudentHandle.filterGroup(students, group);
        System.out.println(filteredStudents);
        for (Student student : filteredStudents) {
            assertEquals(group, student.getGroup());
        }
    }

    @Test
    public void testFilterFacultyCourseGroup() {
        int size = 10000;
        String faculty = StudentData.faculties[ThreadLocalRandom.current().nextInt(StudentData.faculties.length)];
        int course = ThreadLocalRandom.current().nextInt(StudentData.minCourse, StudentData.maxCourse + 1);
        int group = ThreadLocalRandom.current().nextInt(StudentData.minGroup, StudentData.maxGroup + 1);
        System.out.println(faculty);
        System.out.println(course);
        System.out.println(group);
        ArrayList<Student> students = StudentGenerator.generateStudents(size);
        students = StudentHandle.filterFaculty(students, faculty);
        students = StudentHandle.filterCourse(students, course);
        students = StudentHandle.filterGroup(students, group);
        System.out.println(students);
        for (Student student : students) {
            assertEquals(faculty, student.getFaculty());
            assertEquals(course, student.getCourse());
            assertEquals(group, student.getGroup());
        }
    }

    @Test
    public void testEquals() {
        final String name = StudentData.names[ThreadLocalRandom.current().nextInt(StudentData.names.length)];
        final String surname =
                StudentData.surnames[ThreadLocalRandom.current().nextInt(StudentData.surnames.length)];
        final String patronymic = StudentData.patronymics[ThreadLocalRandom.current()
                .nextInt(StudentData.patronymics.length)];
        final LocalDate birthday = StudentUtils.getRandomLocalDateBetweenYears();
        final String address =
                StudentData.addresses[ThreadLocalRandom.current().nextInt(StudentData.addresses.length)];
        final String phoneNumber = StudentData.phoneNumbers[ThreadLocalRandom.current()
                .nextInt(StudentData.phoneNumbers.length)];
        final String faculty =
                StudentData.faculties[ThreadLocalRandom.current().nextInt(StudentData.faculties.length)];
        final int course = ThreadLocalRandom.current().nextInt(StudentData.minCourse, StudentData.maxCourse + 1);
        final int group = ThreadLocalRandom.current().nextInt(StudentData.minGroup, StudentData.maxGroup + 1);

        Student student1 = new Student(name, surname, patronymic, birthday, address, phoneNumber, faculty, course,
                group);
        Student student2 = new Student(name, surname, patronymic, birthday, address, phoneNumber, faculty, course,
                group);
        assertEquals(student1, student2);
        assertEquals(student1, student1);
        assertNotEquals(student1, null);
    }

    @Test
    public void testHashCode() {
        final String name = StudentData.names[ThreadLocalRandom.current().nextInt(StudentData.names.length)];
        final String surname =
                StudentData.surnames[ThreadLocalRandom.current().nextInt(StudentData.surnames.length)];
        final String patronymic = StudentData.patronymics[ThreadLocalRandom.current()
                .nextInt(StudentData.patronymics.length)];
        final LocalDate birthday = StudentUtils.getRandomLocalDateBetweenYears();
        final String address =
                StudentData.addresses[ThreadLocalRandom.current().nextInt(StudentData.addresses.length)];
        final String phoneNumber = StudentData.phoneNumbers[ThreadLocalRandom.current()
                .nextInt(StudentData.phoneNumbers.length)];
        final String faculty =
                StudentData.faculties[ThreadLocalRandom.current().nextInt(StudentData.faculties.length)];
        final int course = ThreadLocalRandom.current().nextInt(StudentData.minCourse, StudentData.maxCourse + 1);
        final int group = ThreadLocalRandom.current().nextInt(StudentData.minGroup, StudentData.maxGroup + 1);

        Student student1 = new Student(name, surname, patronymic, birthday, address, phoneNumber, faculty, course,
                group);
        Student student2 = new Student(name, surname, patronymic, birthday, address, phoneNumber, faculty, course,
                group);
        assertEquals(student1.hashCode(), student2.hashCode());
        assertNotEquals(student1.getId(), student2.getId());
    }

}
