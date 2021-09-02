package sec16.exam01_java_time;

import java.time.*;
import java.time.temporal.*;

public class DateTimeChangeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("����: " + now);
		
		LocalDateTime targetLocalDateTime = null;
		//��������
				targetLocalDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(5)
				.withHour(13)
				.withMinute(30)
				.withSecond(20);
		
		
		System.out.println("���� ����:" + targetLocalDateTime);
		
		//�⵵ ��� ����
		targetLocalDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("�̹� ���� ù ��: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("�̹� ���� ������ ��: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("���� ���� ù ��: " + targetLocalDateTime);
		
		//�� ��뺯��
		targetLocalDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("�̹� �� ù ��: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("�̹� �� ������ ��: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("���� �� ù ��: " + targetLocalDateTime);
		
		//���� ��� ����
		targetLocalDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("�̹� �� ù��° ������: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("���� ���ƿ��� ������: " + targetLocalDateTime);
		
		targetLocalDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("���� ������: " + targetLocalDateTime);
	}
}
