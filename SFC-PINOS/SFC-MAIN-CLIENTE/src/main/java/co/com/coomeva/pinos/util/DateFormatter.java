package co.com.coomeva.pinos.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class DateFormatter {
	
	private DateFormatter() {
		
	}
	
	public static String actualDateStringYYYYMMDD() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		return LocalDate.now().format(formatter);
		
	}
	
	public static Long actualDateLongYYYYMMDD() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		return Long.valueOf(LocalDate.now().format(formatter));
		
	}
	
	public static String actualTimeHHMMSSwithoutDoublePoints() {
		
		return actualTime(false);
	}
	
	public static String actualTimeHHMMSS() {
		
		return actualTime(true);

	}
	
	private static String actualTime(boolean doublePoints) {
				
		LocalDateTime locaDate = LocalDateTime.now();
		String hours  = String.valueOf(locaDate.getHour());
		String minutes = String.valueOf(locaDate.getMinute());
		String seconds = String.valueOf(locaDate.getSecond());
		
		if(hours.length()<2) {
			hours = "0" + hours;
		}
		if(minutes.length()<2) {
			minutes = "0" + minutes;
		}
		if(seconds.length()<2) {
			seconds = "0" + seconds;
		}
		
		if(doublePoints) {
			return (hours  + ":" + minutes + ":" + seconds);	
		}else {
			return (hours  + minutes + seconds);
		}
		
	}
	
	public static String sumarFecha() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 18);
		try {
			return(formatearCalendar(c));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String formatearCalendar(Calendar c) {
		
		String expMonth = String.valueOf(c.get(Calendar.MONTH)+1);
		if(expMonth.length()<2) {
			expMonth = "0" + expMonth;
		}
		String expDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
		if(expDay.length()<2) {
			expDay = "0" + expDay;
		}
		int expYear = c.get(Calendar.YEAR);
		
		return  expYear + expMonth + expDay;
}
	
	

}
