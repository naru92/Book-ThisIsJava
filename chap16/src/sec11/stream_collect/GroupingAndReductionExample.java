package sec11.stream_collect;

import java.util.*;
import java.util.stream.*;

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿",10, Student.Sex.MALE),
				new Student("�����",12, Student.Sex.FEMALE),
				new Student("�ſ��",10, Student.Sex.MALE),
				new Student("�ڼ���",12, Student.Sex.FEMALE)
			);
		
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(
						Student::getSex,
						Collectors.averagingDouble(Student::getScore)
					)
				);
		
		System.out.println("�� ��� ����: " + mapBySex.get(Student.Sex.MALE));
		System.out.println("�� ��� ����: " + mapBySex.get(Student.Sex.FEMALE));
		
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(
					Collectors.groupingBy(
							Student::getSex,
							Collectors.mapping(Student::getName, Collectors.joining(","))
					)
						
				);
		System.out.println("�� ��ü �̸�: " + mapByName.get(Student.Sex.MALE));
		System.out.println("�� ��ü �̸�: " + mapByName.get(Student.Sex.FEMALE));
		

	}

}
