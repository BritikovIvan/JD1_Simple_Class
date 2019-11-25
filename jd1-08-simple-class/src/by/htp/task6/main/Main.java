package by.htp.task6.main;

import by.htp.task6.entity.Time;
import by.htp.task6.logic.TimeLogic;
import by.htp.task6.view.TimePrinter;

public class Main {
	
	public static void main(String[] args) {
		Time time = new Time(14, 52, 44);
		TimePrinter printer = new TimePrinter();
		TimeLogic logic = new TimeLogic();
		
		printer.print(logic.change(time, 4, 63, 24));
	}

}
