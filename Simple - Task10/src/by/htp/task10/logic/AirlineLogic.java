package by.htp.task10.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.task10.entity.Airline;
import by.htp.task10.entity.Week;

public class AirlineLogic {

	public List<Airline> findByDestination(List<Airline> airport, String destination) {

		List<Airline> findByDestination = new ArrayList<Airline>();

		for (int i = 0; i < airport.size(); i++) {
			if (airport.get(i).getDestination().equals(destination)) {
				findByDestination.add(airport.get(i));
			}
		}
		return findByDestination;
	}

	public List<Airline> findByDayWeek(List<Airline> airport, Week day) {

		List<Airline> findByDayWeek = new ArrayList<Airline>();

		for (int i = 0; i < airport.size(); i++) {
			if (airport.get(i).getWeekdays().equals(day)) {
				findByDayWeek.add(airport.get(i));
			}
		}
		return findByDayWeek;
	}

	public List<Airline> findByDayweekAndTime(List<Airline> airport, Week day, String time) {

		List<Airline> findByDayweekAndTime = new ArrayList<Airline>();

		for (int i = 0; i < airport.size(); i++) {
			if (airport.get(i).getWeekdays().equals(day)) {
				if (airport.get(i).getTime().compareTo(time) > 0) {
					findByDayweekAndTime.add(airport.get(i));
				}
			}

		}

		return findByDayweekAndTime;
	}
}
