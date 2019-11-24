package by.htp.task3.view;

import java.util.List;

import by.htp.task3.entity.Student;

public class StudentView {

	public void printALevelStudents(List<Student> groupLogic) {

		for (int i = 0; i < groupLogic.size(); i++) {
			String surname = groupLogic.get(i).getSurname();
			int group = groupLogic.get(i).getGroupNumber();
			System.out.println("Фамилия " + surname + ", Группа: " + group);
		}
	}
}
