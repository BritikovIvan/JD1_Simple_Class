package by.htp.task4.main;

import java.util.List;

import by.htp.task4.entity.Depot;
import by.htp.task4.entity.Train;
import by.htp.task4.logic.DepotLogic;
import by.htp.task4.view.DepotPrinter;
import by.htp.task4.view.TrainPrinter;

public class Main {

	public static void main(String[] args) {
		Depot depot = new Depot();
		depot.setTrains(new Train(5, "Minsk", "a.m. 8.02"));
		depot.setTrains(new Train(2, "Brest", "a.m. 6.20"));
		depot.setTrains(new Train(4, "Minsk", "p.m. 9.09"));
		depot.setTrains(new Train(3, "Grodno", "a.m. 4.20"));
		depot.setTrains(new Train(1, "Minsk", "p.m. 5.40"));
		
		DepotLogic logic = new DepotLogic();
		List<Train> sortByNumber = logic.sortByNumber(depot);
		DepotPrinter depotPrinter = new DepotPrinter();
		depotPrinter.print(sortByNumber);
		System.out.println("-------------------------------------------------------");
		
		Train train = logic.findByNumber(depot, 3);
		TrainPrinter trainPrinter = new TrainPrinter();
		trainPrinter.print(train);
		System.out.println("-------------------------------------------------------");
		
		List<Train> sortByDestination = logic.sortByDestination(depot);
		depotPrinter.print(sortByDestination);
		System.out.println();
	}

}
