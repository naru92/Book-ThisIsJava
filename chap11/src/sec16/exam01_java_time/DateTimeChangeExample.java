package sec16.exam01_java_time;

import java.time.*;
import java.time.temporal.*;

public class DateTimeChangeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재: " + now);
		
		LocalDateTime targetLocalDateTime = null;
		//직접변경
				targetLocalDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(5)
				.withHour(13)
				.withMinute(30)
				.withSecond(20);
		
		
		System.out.println("직접 변경:" + targetLocalDateTime);
		
		//년도 상대 변경
		targetLocalDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번 해의 첫 일: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번 해의 마지막 일: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음 해의 첫 일: " + targetLocalDateTime);
		
		//월 상대변경
		targetLocalDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달 첫 일: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달 마지막 일: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음 달 첫 일: " + targetLocalDateTime);
		
		//요일 상대 변경
		targetLocalDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달 첫번째 월요일: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("다음 돌아오는 월요일: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일: " + targetLocalDateTime);
	}
}
