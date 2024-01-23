package org.example;


import java.util.ArrayList;
import java.util.Comparator;

public class StudentHandle {
    private StudentHandle() {
        throw new AssertionError("Cannot create instance of StudentFilter class");
    }

    public static ArrayList<Student> filterFaculty(ArrayList<Student> students, String faculty) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                result.add(student);
            }
        }
        return result;
    }

    public static ArrayList<Student> sortCourse(ArrayList<Student> students) {
        Comparator<Student> courseComparator = Comparator.comparingInt(Student::getCourse);
        students.sort(courseComparator);
        return new ArrayList<>(students);
    }

    public static ArrayList<Student> filterOlder(ArrayList<Student> students, int year) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getBirthday().getYear() > year) {
                result.add(student);
            }
        }
        return result;
    }

    public static ArrayList<Student> filterCourse(ArrayList<Student> students, int course) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourse() == course) {
                result.add(student);
            }
        }
        return result;
    }

    public static ArrayList<Student> filterGroup(ArrayList<Student> students, int group) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup() == group) {
                result.add(student);
            }
        }
        return result;
    }

}
