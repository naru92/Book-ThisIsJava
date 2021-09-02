package sec16.exam01_java_time;

import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class DateTimeCreateExample {
	public static void main(String[] args) throws Exception {
		//날짜얻기
		LocalDate currDate = LocalDate.now();
		System.out.println("현재날짜: " + currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("목표날짜: " + targetDate);
		
		//시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재시간: " + currTime);
		
		LocalTime targetTime = LocalTime.of(6,30,0,0);
		System.out.println("목표시간: " + targetTime);
		
		//날짜와 시간
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜&시간: " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024,5,10,6,30,0,0);
		System.out.println("목표 날짜&시간: " + targetDateTime);
		
		//협정 세계시와 시간존(TimeZone)
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		
		/*ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_york"));
		System.out.println("뉴욕의 시간존 :" + newyorkDateTime);*/
		
		/*String[] avavailableIDs =TimeZone.getAvailableIDs();
		for(String zoneId : avavailableIDs) {
			System.out.println(zoneId);*/
		
		//특정 시점의 타임 스탬프 얻기
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1이 빠릅니다.");
		}else if(instant1.isAfter(instant2)) {
			System.out.println("instant1이 느립니다");
		}else {
			System.out.println("동일한 시간입니다.");
		}
		System.out.println("차이(NANOS): " + instant1.until(instant2, ChronoUnit.NANOS));
		
	 }
	}

