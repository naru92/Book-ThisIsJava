package sec16.exam01_java_time;

import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class DateTimeCreateExample {
	public static void main(String[] args) throws Exception {
		//��¥���
		LocalDate currDate = LocalDate.now();
		System.out.println("���糯¥: " + currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("��ǥ��¥: " + targetDate);
		
		//�ð� ���
		LocalTime currTime = LocalTime.now();
		System.out.println("����ð�: " + currTime);
		
		LocalTime targetTime = LocalTime.of(6,30,0,0);
		System.out.println("��ǥ�ð�: " + targetTime);
		
		//��¥�� �ð�
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("���� ��¥&�ð�: " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024,5,10,6,30,0,0);
		System.out.println("��ǥ ��¥&�ð�: " + targetDateTime);
		
		//���� ����ÿ� �ð���(TimeZone)
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� �����: " + utcDateTime);
		
		/*ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_york"));
		System.out.println("������ �ð��� :" + newyorkDateTime);*/
		
		/*String[] avavailableIDs =TimeZone.getAvailableIDs();
		for(String zoneId : avavailableIDs) {
			System.out.println(zoneId);*/
		
		//Ư�� ������ Ÿ�� ������ ���
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1�� �����ϴ�.");
		}else if(instant1.isAfter(instant2)) {
			System.out.println("instant1�� �����ϴ�");
		}else {
			System.out.println("������ �ð��Դϴ�.");
		}
		System.out.println("����(NANOS): " + instant1.until(instant2, ChronoUnit.NANOS));
		
	 }
	}

