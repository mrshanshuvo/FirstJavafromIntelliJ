package javabegginer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        
        LocalDate myDate = LocalDate.now(); // Create a date object
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        String formattedDate = myDate.format(formatter2);
        System.out.println("Today's Date: "+formattedDate);

        LocalTime myTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = myTime.format(formatter);
        System.out.println("Today's Time: "+formattedTime);
    }
}
