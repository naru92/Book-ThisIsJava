package sec06.exam01_generic_wildcard;

import java.util.*;

public class WildCardExample {
	
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+"수강생" + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+"수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWoker(Course<? super Worker> course) {
		System.out.println(course.getName()+"수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
		Course<Person> personCourse = new Course<>("일반인과정",5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정",5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse= new Course<>("학생 과정",5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudent= new Course<>("고등학생학생 과정",5);
		highStudent.add(new HighStudent("고등학생"));
		
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
