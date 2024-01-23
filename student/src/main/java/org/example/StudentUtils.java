package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ThreadLocalRandom;

public class StudentUtils {
    private StudentUtils() {
        throw new AssertionError("Cannot create instance of StudentsUtils class");
    }

    public static LocalDate getRandomLocalDateBetweenYears() {
        final LocalDate startDate = LocalDate.of(StudentData.startYear, 1, 1);
        final LocalDate endDate = LocalDate.of(StudentData.endYear, 12, 31);
        final long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        final long randomDay = ThreadLocalRandom.current().nextLong(daysBetween);
        return startDate.plusDays(randomDay);
    }
}
