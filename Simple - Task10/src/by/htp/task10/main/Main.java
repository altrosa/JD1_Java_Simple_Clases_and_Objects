package by.htp.task10.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.task10.entity.Airline;
import by.htp.task10.entity.Week;
import by.htp.task10.logic.AirlineLogic;
import by.htp.task10.view.AirlinesView;

public class Main {

	public static void main(String[] args) {

		List<Airline> airlines = new ArrayList<Airline>();

		airlines.add(new Airline("Amsterdam", 579, "Airbus", "11.45", Week.valueOf("Monday")));
		airlines.add(new Airline("Paris", 643, "Boeing", "10.26", Week.valueOf("Thursday")));
		airlines.add(new Airline("Moscow", 587, "Boeing", "12.39", Week.valueOf("Thursday")));
		airlines.add(new Airline("New-York", 154, "Airbus", "18.15", Week.valueOf("Saturday")));
		airlines.add(new Airline("Warszawa", 851, "Boeing", "14.10", Week.valueOf("Friday")));
		airlines.add(new Airline("Moscow", 587, "Boeing", "12.39", Week.valueOf("Sunday")));
		airlines.add(new Airline("Paris", 147, "Airbus", "11.25", Week.valueOf("Tuesday")));
		airlines.add(new Airline("Krakow", 431, "Boeing", "10.15", Week.valueOf("Wednesday")));
		airlines.add(new Airline("Los-Angeles", 100, "Boeing", "09.00", Week.valueOf("Monday")));

		AirlineLogic logic = new AirlineLogic();
		AirlinesView view = new AirlinesView();

		// Поиск по пункту назначения.
		List<Airline> findByDestination = logic.findByDestination(airlines, "Moscow");
		view.airlinesView(findByDestination);

		// Поиск по дню недели.
		List<Airline> findByDayWeek = logic.findByDayWeek(airlines, Week.Friday);
		view.airlinesView(findByDayWeek);

		// Поиск по дню недели и времени отправдения.
		List<Airline> findByDayweekAndTime = logic.findByDayweekAndTime(airlines, Week.Monday, "08.00");
		view.airlinesView(findByDayweekAndTime);

	}

}
