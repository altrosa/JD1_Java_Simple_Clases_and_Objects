package by.htp.task4.logic;

import java.util.Comparator;

import by.htp.task4.entity.Train;

public class TrainComparator implements Comparator<Train> {

	public int compare(Train o1, Train o2) {
		if (o1.getTrainNumber() < o2.getTrainNumber())
			return -1;
		else if (o1.getTrainNumber() == o2.getTrainNumber())
			return 0;
		else
			return 1;
	}
}
