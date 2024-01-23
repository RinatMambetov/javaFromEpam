package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private static int id;

    private final int studentId;
    private final String name;
    private final String surname;
    private final String patronymic;
    private final LocalDate birthday;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private int group;

    public Student(final String name, final String surname, final String patronymic, final LocalDate birthday) {
        this.studentId = Student.id;
        Student.id++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
    }

    public Student(final String name, final String surname, final String patronymic, final LocalDate birthday,
                   final String address, final String phoneNumber) {
        this(name, surname, patronymic, birthday);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Student(final String name, final String surname, final String patronymic, final LocalDate birthday,
                   final String address, final String phoneNumber, final String faculty, final int course,
                   final int group) {
        this(name, surname, patronymic, birthday, address, phoneNumber);
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, birthday, address, phoneNumber, faculty, course,
                group);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Student student = (Student) obj;
        return getName().equals(student.getName())
                && getSurname().equals(student.getSurname()) && getPatronymic().equals(student.getPatronymic())
                && getBirthday().equals(student.getBirthday()) && getAddress().equals(student.getAddress())
                && getPhoneNumber().equals(student.getPhoneNumber()) && getFaculty().equals(student.getFaculty())
                && getCourse() == student.getCourse() && getGroup() == student.getGroup();
    }

    @Override
    public String toString() {
        return "Student [id=" + studentId + ", name=" + name + ", surname=" + surname + ", patronymic=" + patronymic
                + ", birthday=" + birthday + ",\naddress=" + address + ", phone=" + phoneNumber + ", faculty=" + faculty
                + ", course=" + course + ", group=" + group + "]\n";
    }

    public int getId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }
}
