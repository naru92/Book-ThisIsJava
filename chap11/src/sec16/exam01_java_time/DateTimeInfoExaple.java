package sec16.exam01_java_time;

import java.time.*;

public class DateTimeInfoExaple {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "��";
		strDateTime += now.getMonthValue() + "��";
		strDateTime += now.getDayOfMonth() + "��";
		DayOfWeek dow = now.getDayOfWeek();
		if(dow == DayOfWeek.MONDAY) {
			strDateTime += "������";
		}else if(dow == DayOfWeek.TUESDAY) {
			strDateTime += "ȭ����";
		}else {
			strDateTime += "������";
		}
		strDateTime += now.getHour() + "��";
		strDateTime += now.getMinute() + "��";
		strDateTime += now.getSecond() + "��";
		strDateTime += now.getNano() + "������";
		System.out.println(strDateTime);
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("���ش� ���� 2���� 29�ϱ���");
		}else {
			System.out.println("���ش� ��� 2���� 28�ϱ���");
		}
		ZonedDateTime utcDateTime =ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� ����� : " + utcDateTime);
		
		ZonedDateTime seoulDateTime =ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� Ÿ����  : " + seoulDateTime);
		
		ZoneId seoulZoneId = seoulDateTime.getZone();
		System.out.println("���� ��Id :" + seoulZoneId);
		ZoneOffset seoulZoneOffSet = seoulDateTime.getOffset();
		System.out.println("���� ��������: " + seoulZoneOffSet);
	}
}
