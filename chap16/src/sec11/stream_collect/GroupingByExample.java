package sec11.stream_collect;

import java.util.*;
import java.util.stream.*;

public class GroupingByExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
					new Student("ȫ�浿",10, Student.Sex.MALE,Student.City.Seoul),
					new Student("�����",6, Student.Sex.FEMALE,Student.City.Pusan),
					new Student("�ſ��",10, Student.Sex.MALE,Student.City.Pusan),
					new Student("�ڼ���",6, Student.Sex.FEMALE,Student.City.Seoul)
		);
		
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex));
		
				System.out.println("[���л�]");
			mapBySex.get(Student.Sex.MALE).stream()
			.forEach(s->System.out.print(s.getName() + " "));
			
			System.out.println("\n[���л�]");
			mapBySex.get(Student.Sex.FEMALE).stream()
			.forEach(s->System.out.print(s.getName() + " "));
			
			System.out.println();
			
			Map<Student.City, List<String>> mapByCity = totalList.stream()
					.collect(Collectors.groupingBy(
							Student::getCity,
							Collectors.mapping(Student::getName, Collectors.toList())
					   )	
					);
			System.out.println("\n[����]");
			mapByCity.get(Student.City.Seoul).stream()
				.forEach(name->System.out.print(name + " "));
					
			System.out.println("\n[�λ�]");
			mapByCity.get(Student.City.Pusan).stream()
				.forEach(name->System.out.print(name + " "));
					
	}

}
