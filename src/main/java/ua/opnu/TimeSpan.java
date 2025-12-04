package ua.opnu;


public class TimeSpan {

    // Храним всё время в минутах
    private int totalMinutes;

    TimeSpan(int hours, int minutes) {
        // Невалидные аргументы -> интервал 0:00
        if (hours < 0 || minutes < 0 || minutes > 59) {
            this.totalMinutes = 0;
        } else {
            this.totalMinutes = hours * 60 + minutes;
        }
    }

    int getHours() {
        return totalMinutes / 60;
    }

    int getMinutes() {
        return totalMinutes % 60;
    }

    void add(int hours, int minutes) {
        // Если аргументы некорректные — ничего не меняем
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }
        totalMinutes += hours * 60 + minutes;
    }

    void addTimeSpan(TimeSpan timespan) {
        if (timespan == null) {
            return;
        }
        totalMinutes += timespan.getTotalMinutes();
    }

    double getTotalHours() {
        return totalMinutes / 60.0;
    }

    int getTotalMinutes() {
        return totalMinutes;
    }

    void subtract(TimeSpan span) {
        if (span == null) {
            return;
        }
        int other = span.getTotalMinutes();
        // Можно вычитать только если результат не уйдет в минус
        if (other <= totalMinutes) {
            totalMinutes -= other;
        }
        // Если other > totalMinutes — ничего не делаем (по тестам)
    }

    void scale(int factor) {
        // Нулевой или отрицательный множитель — интервал не меняется
        if (factor <= 0) {
            return;
        }
        totalMinutes *= factor;
    }
}
