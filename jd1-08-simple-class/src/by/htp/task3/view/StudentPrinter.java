package by.htp.task3.view;

import java.util.List;

import by.htp.task3.entity.Student;

public class StudentPrinter {
	public void print(Student student){
		int[] marks = student.getMarks(); 
		
		System.out.println("Name: " + student.getName());
		System.out.println("Surname: " + student.getSurname());
		System.out.println("Group: " + student.getGroup());
		System.out.print("Marks: ");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i] + "\t");
		}
		System.out.println();
	}
	
	public void printALevelStudents(int group, List<Student> students) {
		System.out.println("A level students in group " + group + " are: ");
		for(Student student : students) {
			System.out.println(student.getSurname());
		}
	}
} 
