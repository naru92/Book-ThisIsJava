package sec16.exam01_java_time;

import java.time.*;
import java.time.temporal.*;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		
	
	LocalDateTime startDateTime = LocalDateTime.of(2023, 1,1,9,0,0);
	System.out.println("������"+startDateTime);
	
	LocalDateTime endDateTime = LocalDateTime.of(2024,3,31,18,0,0);
	System.out.println("������: " + endDateTime + "\n");
	
	if(startDateTime.isBefore(endDateTime)){
		System.out.println("���� ���Դϴ�." + "\n");		
	}else if(startDateTime.isEqual(endDateTime)) {
		System.out.println("�����մϴ�." + "\n");
	}else if(startDateTime.isAfter(endDateTime)) {
		System.out.println("�����߽��ϴ�." + "\n");
	}
	
	System.out.println("[������� ���� �ð�]");
	long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
	System.out.println("���� ��: "+ remainYear);
	long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
	System.out.println("���� ��: "+ remainMonth);
	long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
	System.out.println("���� ��: "+ remainDay);
	long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
	System.out.println("���� �ð�: "+ remainHour);
	long remainMinutes = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
	System.out.println("���� ��: "+ remainMinutes);
	long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
	System.out.println("���� ��: "+ remainSecond +"\n");
	
	remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
	System.out.println("���� ��: "+ remainYear);
	remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
	System.out.println("���� ��: " + remainMonth);
	remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
	System.out.println("���� ��: " + remainDay + "\n");
	
	Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
	System.out.print("�����Ⱓ: " + period.getYears()+ "��");
	System.out.print(period.getMonths()+ "��");
	System.out.println( period.getDays()+ "��"+"\n");
	
	Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
	System.out.println("���� �ð�: " + duration.toHours());
	System.out.println("���� �ð�: " + duration.toMinutes());
	System.out.println("���� ��: " + duration.getSeconds());
	
  }
}
