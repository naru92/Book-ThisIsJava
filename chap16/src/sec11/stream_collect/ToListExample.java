package sec11.stream_collect;

import java.util.*;
import java.util.stream.*;

public class ToListExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList( 
				new Student("ȫ�浿",10,Student.Sex.MALE),
				new Student("�����",6,Student.Sex.FEMALE),
				new Student("�ſ��",10,Student.Sex.MALE),
				new Student("�ڼ���",6,Student.Sex.FEMALE)
			);
		
		
		//���л��� ����
		List<Student> maleList = totalList.stream()
			.filter(s->s.getSex()==Student.Sex.MALE)
			.collect(Collectors.toList());
		maleList.stream()
			.forEach(s->System.out.println(s.getName()));
		
		
		System.out.println();
		
		//���л��� ����
		Set<Student> femaleSet = totalList.stream()
			.filter(s->s.getSex()==Student.Sex.FEMALE)
			.collect(Collectors.toCollection(HashSet::new));
		femaleSet.stream()
			.forEach(s->System.out.println(s.getName()));
	}
}
