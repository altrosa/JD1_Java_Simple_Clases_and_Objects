package by.htp.task3.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.task3.entity.Group;
import by.htp.task3.entity.Student;
import by.htp.task3.logic.StudentLogic;

public class GroupLogic {

	private List<Student> overNine = new ArrayList<Student>();
	StudentLogic studentLogic = new StudentLogic();

	public List<Student> isALevelStudent(Group group) {

		for (int i = 0; i < group.getStudents().size(); i++) {
			if (studentLogic.isALevelStudent(group.getStudents().get(i))) {
				overNine.add(group.getStudents().get(i));
			}
		}
		return (ArrayList<Student>) overNine;
	}

}