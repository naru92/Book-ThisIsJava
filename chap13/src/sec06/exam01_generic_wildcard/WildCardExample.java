package sec06.exam01_generic_wildcard;

import java.util.*;

public class WildCardExample {
	
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+"������" + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+"������" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWoker(Course<? super Worker> course) {
		System.out.println(course.getName()+"������" + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���",5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Person("������"));
		personCourse.add(new Person("�л�"));
		personCourse.add(new Person("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("������ ����",5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse= new Course<>("�л� ����",5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highStudent= new Course<>("����л��л� ����",5);
		highStudent.add(new HighStudent("����л�"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudent);
		System.out.println();
		
		/*registerCourseStudent(personCourse);
		registerCourseStudent(workerCourse);*/
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudent);
		System.out.println();
		
		registerCourseWoker(personCourse);
		registerCourseWoker(workerCourse);
		/*registerCourseWoker(studentCourse);
		registerCourseWoker(highStudent);*/
		System.out.println();
		
	}
}
