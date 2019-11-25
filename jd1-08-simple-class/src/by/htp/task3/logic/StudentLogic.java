package by.htp.task3.logic;

import by.htp.task3.entity.Student;

public class StudentLogic {
	private static final int A_LEVEL_LIMIT = 9;
	
	public boolean isALevelStudent(Student student) {
		int[] marks = student.getMarks();
		
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < A_LEVEL_LIMIT) {
				return false;
			}
		}
		
		return true;
	}
}
