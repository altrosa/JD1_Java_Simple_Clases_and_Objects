package by.htp.task3.entity;

import java.util.Arrays;

public class Student {

	/*
	 * 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
	 * номер группы, успеваемость (массив из пяти элементов). Создайте массив из
	 * десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров
	 * групп студентов, имеющих оценки, равные только 9 или 10.
	 * 
	 */

	private String name;
	private String surname;
	int groupNumber;
	private static final int STUDENT_MARK_COUNT = 5;
	int[] marks = new int[STUDENT_MARK_COUNT];

	public Student() {

	}

	public Student(String name, String surname, int groupNumber, int[] marks) {

		this.name = name;
		this.surname = surname;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public static int getStudentMarkCount() {
		return STUDENT_MARK_COUNT;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNumber;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (groupNumber != other.groupNumber)
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}
