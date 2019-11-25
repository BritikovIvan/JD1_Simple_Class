package by.htp.task3.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.task3.entity.Group;
import by.htp.task3.entity.Student;

public class GroupLogic {
	
	private StudentLogic studentLogic = new StudentLogic();
	
	public List<Student> takeALevelStudents(Group group){
		
		List<Student> result = new ArrayList<Student>();
		
		for(Student student : group.getStudents()) {
			boolean isALevelStudent = studentLogic.isALevelStudent(student);
			
			if (isALevelStudent) {
				result.add(student);
			}
		}
		
		return result;
	}
	
}
