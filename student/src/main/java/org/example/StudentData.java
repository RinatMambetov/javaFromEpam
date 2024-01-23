package org.example;

public final class StudentData {
    public static final String[] names = {"Александр", "Иван", "Дмитрий",
            "Сергей", "Николай", "Андрей", "Владимир", "Петр", "Алексей", "Михаил"};
    public static final String[] surnames = {"Иванов", "Петров", "Смирнов",
            "Соколов", "Кузнецов", "Васильев", "Попов", "Лебедев", "Семенов", "Егоров"};
    public static final String[] patronymics = {"Александрович", "Иванович", "Дмитриевич", "Сергеевич", "Николаевич",
            "Андреевич", "Владимирович", "Петрович", "Алексеевич", "Михайлович"};
    public static final int startYear = 2000;
    public static final int endYear = 2009;
    public static final String[] addresses = {"Москва", "Санкт-Петербург",
            "Новосибирск", "Екатеринбург", "Нижний Новгород", "Казань", "Челябинск", "Омск", "Самара",
            "Ростов-на-Дону"};
    public static final String[] phoneNumbers = {"+79123456789", "+79091234567", "+79234567890", "+79991234567",
            "+79887654321", "+79001112233", "+79782233445", "+79112233445", "+79885556677", "+79113332211"};
    public static final String[] faculties = {"Факультет биологии", "Факультет химии", "Факультет физики",
            "Факультет математики", "Факультет информационных технологий", "Факультет иностранных языков",
            "Факультет экономики", "Факультет медицины", "Факультет социологии", "Факультет искусств"};
    public static final int minCourse = 1;
    public static final int maxCourse = 5;
    public static final int minGroup = 1;
    public static final int maxGroup = 10;

    private StudentData() {
        throw new AssertionError("Cannot create instance of StudentsData class");
    }

}
