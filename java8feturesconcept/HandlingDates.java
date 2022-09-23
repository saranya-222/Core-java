package java8feturesconcept;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println("Current date :"+date);
       LocalTime time=LocalTime.now();
       System.out.println("\nCurrent time :"+time);
       LocalDateTime dt=LocalDateTime.now();
       System.out.println("\nCurrent date and time :"+dt);
       LocalDate setd=LocalDate.of(2001, 12, 22);
       System.out.println("\nCustomized date using of() :"+setd);
       LocalDate setd1=LocalDate.parse("2007-10-04");
       System.out.println("\nCustomized date using parse() :"+setd1);
       
       //Accessing yesterday's and tomorrow's date and time
       LocalDate yes_date=date.minusDays(1);
       System.out.println("\nyesterday  :"+yes_date);
       LocalDate tom_date=setd.plusDays(1);
       System.out.println("\ntomorrow  :"+tom_date);
       
       //Checking leap year
       System.out.println("Is leap year ?"+yes_date.isLeapYear());
       
       //Changing date format
       DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
       String formatted=date.format(format);
       System.out.println("\nformatted date :"+formatted);
       
       
       //handling zones
  ZonedDateTime z=ZonedDateTime.now();
  System.out.println("\n Zone :"+z);
  System.out.println("\nCurrent zone :"+z.getZone());
  ZoneId zone=ZoneId.of("Asia/Tokyo");//setting the zones.
  ZonedDateTime z1=z.withZoneSameInstant(zone);
  System.out.println("\n time for set zone :"+z1);
  
  
	}

}
