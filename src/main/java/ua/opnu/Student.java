package ua.opnu;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int year; // 1..4
    private List<String> courses;

    public Student(String name, int year) {
        if (name == null) {
            this.name = "";
        } else {
            this.name = name.trim();
        }

        // Рік навчання від 1 до 4, інакше ставимо 1
        if (year < 1 || year > 4) {
            this.year = 1;
        } else {
            this.year = year;
        }

        this.courses = new ArrayList<>();
    }

    public void addCourse(String courseName) {
        if (courseName == null) {
            return;
        }
        String c = courseName.trim();
        if (!c.isEmpty()) {
            courses.add(c);
        }
    }

    public void dropAll() {
        courses.clear();
    }

    public int getCourseCount() {
        return courses.size();
    }

    public String getName() {
        return name;
    }

    public int getTuition() {
        // Кожен рік навчання коштує 20000 грн
        return year * 20000;
    }

    public int getYear() {
        return year;
    }
}
