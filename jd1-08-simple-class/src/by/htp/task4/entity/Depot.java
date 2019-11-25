package by.htp.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Depot {
	
	private List<Train> trains = new ArrayList<Train>();
	
	public Depot() {
		
	}

	public Depot(List<Train> trains) {
		this.trains = trains;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	
	public void setTrains(Train train) {
		this.trains.add(train);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

}
