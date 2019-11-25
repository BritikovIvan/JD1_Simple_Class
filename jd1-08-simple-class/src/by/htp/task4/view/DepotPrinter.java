package by.htp.task4.view;

import java.util.List;

import by.htp.task4.entity.Train;

public class DepotPrinter {
	public void print(List<Train> trains) {
		System.out.println("The following trains are in the depot: ");
		TrainPrinter pr = new TrainPrinter();
		
		for (int i = 0; i < trains.size(); i++) {
			pr.print(trains.get(i));
			System.out.println();
		}
	}

}
