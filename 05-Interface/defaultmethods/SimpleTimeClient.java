package defaultmethods;

import java.time.*;

public class SimpleTimeClient implements TimeClient {
    private LocalDateTime dateAndTime;

    public SimpleTimeClient() {
        dateAndTime = LocalDateTime.now();
    }

    @Override
    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }

    @Override
    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(year, month, day);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }

    @Override
    public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(year, month, day);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }

    public static void main(String[] args) {
        TimeClient s = new SimpleTimeClient();//new后面使用的是实现了接口的类，可以赋值给接口类型的变量
        LocalDateTime currentTime = s.getLocalDateTime();
        System.out.println(currentTime.toString());
        System.out.println("Time in China: " + s.getZonedDateTime("Cuba").toString());
    }
}
