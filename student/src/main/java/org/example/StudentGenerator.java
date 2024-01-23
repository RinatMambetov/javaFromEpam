package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class StudentGenerator {
    private StudentGenerator() {
        throw new AssertionError("Cannot create instance of StudentGenerator class");
    }

    public static Student generateStudent() {
        final String name = StudentData.names[ThreadLocalRandom.current().nextInt(StudentData.names.length)];
        final String surname = StudentData.surnames[ThreadLocalRandom.current().nextInt(StudentData.surnames.length)];
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

        return new Student(name, surname, patronymic, birthday, address, phoneNumber, faculty, course,
                group);
    }

    public static ArrayList<Student> generateStudents(final int size) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            students.add(StudentGenerator.generateStudent());
        }
        return students;
    }

}
