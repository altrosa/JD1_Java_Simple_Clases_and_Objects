package by.htp.task4.entity;

public class Train {

	/*
	 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер
	 * поезда, время отправления. Создайте данные в массив из пяти элементов типа
	 * Train, добавьте возможность сортировки элементов массива по номерам поездов.
	 * Добавьте возможность вывода информации о поезде, номер которого введен
	 * пользователем. Добавьте возможность сортировки массив по пункту назначения,
	 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по
	 * времени отправления.
	 */

	private String pointDepart;
	private String destination;
	private int trainNumber;
	private int departHour;
	private int departMinute;

	public Train() {

	}

	public Train(String pointDepart, String destination, int trainNumber, int departHour, int departMinute) {

		this.pointDepart = pointDepart;
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departHour = departHour;
		this.departMinute = departMinute;

	}

	public String getPointDepart() {

		return pointDepart;
	}

	public void setPointDepart(String pointDepart) {

		this.pointDepart = pointDepart;
	}

	public String getDestination() {

		return destination;
	}

	public void setDestination(String destination) {

		this.destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getDepartHour() {
		return departHour;
	}

	public void setDepartHour(int departHour) {
		this.departHour = departHour;
	}

	public int getDepartMinute() {
		return departMinute;
	}

	public void setDepartMinute(int departMinute) {
		this.departMinute = departMinute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departHour;
		result = prime * result + departMinute;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((pointDepart == null) ? 0 : pointDepart.hashCode());
		result = prime * result + trainNumber;
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
		Train other = (Train) obj;
		if (departHour != other.departHour)
			return false;
		if (departMinute != other.departMinute)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (pointDepart == null) {
			if (other.pointDepart != null)
				return false;
		} else if (!pointDepart.equals(other.pointDepart))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [Точка отправления: " + pointDepart + ", Точка прибытия: " + destination + ", Номер поезда: "
				+ trainNumber + ", Время отправления: " + departHour + ":" + departMinute + "] \n ";
	}

}
