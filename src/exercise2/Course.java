package exercise2;

import java.util.ArrayList;

public class Course {
	 private final ArrayList<Student> students;

	  public Course(String name) {
	    students = new ArrayList<>();
	  }

	  public void addStudent(Student student) {
	    students.add(student);
	  }

	  public void removeStudent(Student student) {
	    students.remove(student);
	  }

	  public void printStudents() {
	    for (Student student : students) {
	      System.out.println(student.getName());
	    }
	  }

}
