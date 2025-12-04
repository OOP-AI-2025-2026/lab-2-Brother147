package ua.opnu;

public class Main {
    public static void main(String[] args) {
        // Створюємо студента (можеш змінити рік навчання при потребі)
        Student student = new Student("Гоженко Михайло", 2);

        // Додаємо кілька дисциплін
        student.addCourse("Програмування");
        student.addCourse("Математика");
        student.addCourse("Фізика");

        // Виводимо дані згідно з вимогами README

        System.out.println(
                student.getName() + ": кількість вивчаємих дисциплін - " + student.getCourseCount()
        );

        System.out.println(
                student.getName() + ": рік навчання - " + student.getYear()
        );

        System.out.println(
                student.getName() + ": заплатив за навчання - " + student.getTuition()
        );
    }
}
