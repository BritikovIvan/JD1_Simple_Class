package by.htp.task6.view;

import by.htp.task6.entity.Time;

public class TimePrinter {
	
	public void print(Time time) {
		System.out.println(time.getHour() + " hours " + time.getMinute() + " minutes " + time.getSecond() + " seconds");
	}

}
