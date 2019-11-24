package by.htp.task10.view;

import java.util.List;

import by.htp.task10.entity.Airline;

public class AirlinesView {

	public void airlinesView(List <Airline> airlines) {
		
		for(int i = 0; i<airlines.size(); i++) {
			
			System.out.println("Destination: " + airlines.get(i).getDestination());
			System.out.println("Flight number: " + airlines.get(i).getFlightNumber());
			System.out.println("Airline type: " + airlines.get(i).getAirlaneType());
			System.out.println("Time: " + airlines.get(i).getTime());
			System.out.println("Day: " + airlines.get(i).getWeekdays());
			System.out.println("-------------------");
		}
	}
}
