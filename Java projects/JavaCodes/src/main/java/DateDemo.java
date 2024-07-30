//package JavaDatePack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class DateDemo {
    public static void main(String[] args) {
        String dob="3-04-2000";
        LocalDate ld1= LocalDate.now();
        System.out.println(ld1.atStartOfDay());
        ld1=ld1.minusDays(2);
        System.out.println(ld1);
        System.out.println(ld1.plusDays(3));
        LocalDate d2=LocalDate.of(2024,02,03);
        System.out.println(d2.atTime(1,34,5));
        LocalDate d3=LocalDate.now();
        System.out.println(d3);
        String str=d3.format(DateTimeFormatter.ISO_DATE);
        System.out.println(str);
        String bdate="2024-06-03";
        LocalDate  bdatenew= LocalDate.parse(bdate);
        System.out.println(bdatenew);
        
        DayOfWeek Day= bdatenew.getDayOfWeek();
        System.out.println(Day);
       
  }
}    
