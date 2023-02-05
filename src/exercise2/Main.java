
package exercise2;

public class Main {

	public static void main(String[] args) {

		Course course = new Course("CYBERSECURITY PL78");

		Student student1 = new Student("KOUASSI KOUAKOU YVES",14, 4.5);
		Student student2 = new Student("JAMES LAWSON", 19, 5.8);
		Student student3 = new Student("PATRICK MAYSI", 20, 4.7);

		course.addStudent(student1);
		course.addStudent(student2);
		course.addStudent(student3);

		System.out.println("STudents list");
		course.printStudents();

		course.removeStudent(student3);

		System.out.println("Students list after delete student3:");
		course.printStudents();

	}
}
