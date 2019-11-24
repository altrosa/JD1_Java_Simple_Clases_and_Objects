package by.htp.task4.view;

import by.htp.task4.entity.Train;

public class TrainView {

	public void trainView(Train[] trains) {

		for (int i = 0; i < trains.length; i++) {

			System.out.println((i + 1) + ": ");

			viewTrainInfo(trains[i]);

		}

	}

	public void viewTrainInfo(Train train) {

		System.out.println("Номер поезда: " + train.getTrainNumber());
		System.out.println("Точка отправления: " + train.getPointDepart());
		System.out.println("Конечная точка прибытия: " + train.getDestination());
		System.out.println("Время отправления: " + train.getDepartHour() + ":" + train.getDepartMinute());
	}

}
