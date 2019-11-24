package by.htp.task10.entity;

public class Airline {

	/*
	 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль. Airline: пункт
	 * назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и
	 * вывести: a) список рейсов для заданного пункта назначения; b) список рейсов
	 * для заданного дня недели; c) список рейсов для заданного дня недели, время
	 * вылета для которых больше заданного
	 */

	private String destination;
	private int flightNumber;
	private String airlaneType;
	private String time;
	private Week weekdays;

	public Airline(String destination, int flightNumber, String airlaneType, String time, Week weekdays) {

		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airlaneType = airlaneType;
		this.time = time;
		this.weekdays = weekdays;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Week getWeekdays() {
		return weekdays;
	}

	public void setWeekdays(Week weekdays) {
		this.weekdays = weekdays;
	}

	public String getAirlaneType() {
		return airlaneType;
	}

	public void setAirlaneType(String airlaneType) {
		this.airlaneType = airlaneType;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlaneType == null) ? 0 : airlaneType.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((weekdays == null) ? 0 : weekdays.hashCode());
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
		Airline other = (Airline) obj;
		if (airlaneType == null) {
			if (other.airlaneType != null)
				return false;
		} else if (!airlaneType.equals(other.airlaneType))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (weekdays != other.weekdays)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", airlaneType=" + airlaneType
				+ ", time=" + time + ", weekdays=" + weekdays + "]";
	}

}
