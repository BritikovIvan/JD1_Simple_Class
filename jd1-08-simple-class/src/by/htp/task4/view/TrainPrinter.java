package by.htp.task4.view;

import by.htp.task4.entity.Train;

public class TrainPrinter {
	public void print(Train train) {
		System.out.println("Train: " + train.getTrain());
		System.out.println("Destination: " + train.getDestination());
		System.out.println("Departure time: " + train.getDepartureTime());
	}

}
