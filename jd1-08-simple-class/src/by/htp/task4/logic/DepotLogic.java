package by.htp.task4.logic;

import java.util.List;

import by.htp.task4.entity.Depot;
import by.htp.task4.entity.Train;

public class DepotLogic {

	public List<Train> sortByNumber(Depot depot) {
		List<Train> trains = depot.getTrains();

		for (int left = 0; left < trains.size(); left++) {
			int maxInd = left;

			for (int i = left; i < trains.size(); i++) {
				int num1 = trains.get(maxInd).getTrain();
				int num2 = trains.get(i).getTrain();
				if (num1 > num2) {
					maxInd = i;
				}
				Train temp = trains.get(left);
				trains.set(left, trains.get(maxInd));
				trains.set(maxInd, temp);
			}
		}

		return trains;
	}

	public Train findByNumber(Depot depot, int number) {
		List<Train> trains = depot.getTrains();
		Train result = new Train();

		for (Train train : trains) {
			if (train.getTrain() == number) {
				result = train;
			}
		}

		return result;
	}

	public List<Train> sortByDestination(Depot depot) {
		List<Train> trains = depot.getTrains();

		for (int i = 0; i < trains.size() - 1; i++) {
			for (int j = i + 1; j < trains.size(); j++) {
				String d1 = trains.get(i).getDestination();
				String d2 = trains.get(j).getDestination();

				if (d1.compareTo(d2) > 0) {
					Train temp = trains.get(i);
					trains.set(i, trains.get(j));
					trains.set(j, temp);
				}
			}
		}

		for (int i = 0; i < trains.size() - 1; i++) {
			String d1 = trains.get(i).getDestination();
			String d2 = trains.get(i + 1).getDestination();
			int lim1 = i;
			int lim2 = i;
			while (i < trains.size() - 1 && d1.equals(d2)) {
				d1 = trains.get(i).getDestination();
				d2 = trains.get(i + 1).getDestination();
				lim2++;
				i++;
			}
			for (int j = lim1; j < lim2; j++) {
				for (int k = j + 1; k < lim2 + 1; k++) {
					String t1 = trains.get(j).getDepartureTime();
					String t2 = trains.get(k).getDepartureTime();

					if (t1.compareTo(t2) > 0) {
						Train temp = trains.get(j);
						trains.set(j, trains.get(k));
						trains.set(k, temp);
					}
				}
			}
		}

		return trains;
	}

}
