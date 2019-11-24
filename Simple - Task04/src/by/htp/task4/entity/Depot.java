package by.htp.task4.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Depot {

	private int number;

	List <Train> trains = new ArrayList<Train>();


	public Depot() {

	}

	public Depot (int number, ArrayList<Train> trains) {

	}

	public Depot(Train... trains) {
		this.trains.addAll(Arrays.asList(trains));
	}
	
	public int getNumber() {
		
		return number;
	}
	
	public void setNumber(int number) {
		
		this.number = number;
	}


	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(ArrayList <Train> trains) {
		this.trains = trains;
	}
	
	

	@Override
	public String toString() {
		return "Depot [number=" + number + ", trains=" + trains + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
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
		Depot other = (Depot) obj;
		if (number != other.number)
			return false;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

}
