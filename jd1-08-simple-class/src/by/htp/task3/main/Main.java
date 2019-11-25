package by.htp.task3.main;

import java.util.List;

import by.htp.task3.entity.Group;
import by.htp.task3.entity.Student;
import by.htp.task3.logic.GroupLogic;
import by.htp.task3.view.StudentPrinter;

public class Main {

	public static void main(String[] args) {
		Group group = new Group(722403);
		List<Student> aLevelStudents;
		
		group.setStudents(new Student("Ivan", "Ivanov", group.getGroup(), new int[] { 5, 9, 10, 4, 8 }));
		group.setStudents(new Student("Alex", "Petrov", group.getGroup(), new int[] { 10, 10, 10, 10, 10 }));
		group.setStudents(new Student("Peter", "Sidorov", group.getGroup(), new int[] { 6, 9, 7, 10, 8 }));
		group.setStudents(new Student("Ivan", "Smirnov", group.getGroup(), new int[] { 5, 9, 9, 4, 8 }));
		group.setStudents(new Student("Alex", "Popov", group.getGroup(), new int[] { 8, 9, 10, 10, 9 }));
		group.setStudents(new Student("Peter", "Sokolov", group.getGroup(), new int[] { 9, 10, 10, 9, 10 }));
		group.setStudents(new Student("Ivan", "Novikov", group.getGroup(), new int[] { 9, 9, 9, 10, 10 }));
		group.setStudents(new Student("Alex", "Morozov", group.getGroup(), new int[] { 9, 9, 10, 4, 10 }));
		group.setStudents(new Student("Peter", "Volkov", group.getGroup(), new int[] { 9, 9, 10, 8, 9 }));
		group.setStudents(new Student("Ivan", "Lebedev", group.getGroup(), new int[] { 10, 9, 10, 10, 10 }));
		
		GroupLogic logic = new GroupLogic();
		aLevelStudents = logic.takeALevelStudents(group);
		StudentPrinter printer = new StudentPrinter();
		printer.printALevelStudents(group.getGroup(), aLevelStudents);
		
	}

}
