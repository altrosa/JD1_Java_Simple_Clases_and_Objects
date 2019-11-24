package by.htp.task3.main;

import java.util.List;

import by.htp.task3.entity.Group;
import by.htp.task3.entity.Student;
import by.htp.task3.logic.GroupLogic;
import by.htp.task3.view.StudentView;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Viachaslau", "Luchko", 1, new int[] { 9, 10, 9, 9, 9 });
		Student student2 = new Student("Andrey", "Zorin", 2, new int[] { 9, 9, 10, 9, 9 });
		Student student3 = new Student("Olga", "Samosuk", 1, new int[] { 7, 8, 10, 8, 9 });
		Student student4 = new Student("Victoria", "Secret", 1, new int[] { 9, 9, 9, 9, 9 });
		Student student5 = new Student("Darya", "Levichev", 1, new int[] { 5, 8, 4, 8, 9 });
		Student student6 = new Student("Pavel", "Muha", 2, new int[] { 5, 8, 4, 8, 9 });
		Student student7 = new Student("Anton", "Klopot", 1, new int[] { 5, 8, 4, 8, 9 });
		Student student8 = new Student("Maria", "Suprinuk", 2, new int[] { 5, 8, 4, 8, 9 });
		Student student9 = new Student("Aleksandr", "Basalai", 1, new int[] { 5, 8, 4, 8, 7 });

		Group group = new Group();
		group.getStudents().add(student1);
		group.getStudents().add(student2);
		group.getStudents().add(student3);
		group.getStudents().add(student4);
		group.getStudents().add(student5);
		group.getStudents().add(student6);
		group.getStudents().add(student7);
		group.getStudents().add(student8);
		group.getStudents().add(student9);

		GroupLogic groupLogic = new GroupLogic();

		List<Student> overNine = groupLogic.isALevelStudent(group);

		StudentView view = new StudentView();
		view.printALevelStudents(overNine);

	}
}
