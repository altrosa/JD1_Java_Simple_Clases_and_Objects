package by.htp.task4.logic;

import java.util.Comparator;

import by.htp.task4.entity.Train;

public class DestinationComparator implements Comparator<Train> {

	public int compare(Train o1, Train o2) {

		int flag = o1.getDestination().compareTo(o2.getDestination());

		if (flag == 0)
			flag = o1.getDepartHour() - (o2.getDepartHour());

		if (flag == 0)
			flag = o1.getDepartMinute() - (o2.getDepartMinute());

		return flag;

	}

}
