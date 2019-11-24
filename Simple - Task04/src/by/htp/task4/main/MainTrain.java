package by.htp.task4.main;

import java.util.Arrays;
import java.util.TreeSet;

import by.htp.task4.entity.Train;
import by.htp.task4.logic.DestinationComparator;
import by.htp.task4.logic.TrainComparator;
import by.htp.task4.view.TrainView;

public class MainTrain {

	public static void main(String[] args) {

		Train[] trains = new Train[5];

		for (int i = 0; i < trains.length; i++) {

			trains[i] = new Train();

		}

		trains[0].setPointDepart("Brest");
		trains[0].setDestination("Amsterdam");
		trains[0].setTrainNumber(1467);
		trains[0].setDepartHour(6);
		trains[0].setDepartMinute(20);

		trains[1].setPointDepart("Minsk");
		trains[1].setDestination("Paris");
		trains[1].setTrainNumber(1050);
		trains[1].setDepartHour(9);
		trains[1].setDepartMinute(33);

		trains[2].setPointDepart("Moscow");
		trains[2].setDestination("Vilnus");
		trains[2].setTrainNumber(1045);
		trains[2].setDepartHour(10);
		trains[2].setDepartMinute(40);

		trains[3].setPointDepart("Krakow");
		trains[3].setDestination("Berlin");
		trains[3].setTrainNumber(1134);
		trains[3].setDepartHour(11);
		trains[3].setDepartMinute(50);

		trains[4].setPointDepart("Gomel");
		trains[4].setDestination("Berlin");
		trains[4].setTrainNumber(1005);
		trains[4].setDepartHour(10);
		trains[4].setDepartMinute(45);

		TrainView print = new TrainView();

		print.trainView(trains);

		TreeSet<Train> trains2 = new TreeSet<Train>(new TrainComparator());

		trains2.addAll(Arrays.asList(trains));

		System.out.println("Сортировка по номеру поезда: \n" + trains2.toString());

		TreeSet<Train> trains3 = new TreeSet<Train>(new DestinationComparator());

		trains3.addAll(Arrays.asList(trains));

		System.out.println("Сортировка по месту назначения: \n" + trains3.toString());
	
		
		
	}

}
