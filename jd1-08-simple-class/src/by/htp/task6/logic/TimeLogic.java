package by.htp.task6.logic;

import by.htp.task6.entity.Time;

public class TimeLogic {
	public Time change(Time time, int hours, int minutes, int seconds) {
		int timeHours = time.getHour() + hours;
		int timeMinutes = time.getMinute() + minutes;
		int timeSeconds = time.getSecond() + seconds;
		
		while (timeSeconds > Time.MINUTE_AND_SECOND_LIMIT) {
			timeSeconds -= Time.MINUTE_AND_SECOND_LIMIT;
			timeMinutes++;
		}
		
		while (timeMinutes > Time.MINUTE_AND_SECOND_LIMIT) {
			timeMinutes -= Time.MINUTE_AND_SECOND_LIMIT;
			timeHours++;
		}
		
		while (timeHours > Time.HOUR_LIMIT) {
			timeHours -= Time.HOUR_LIMIT;
		}
		
		time.setHour(timeHours);
		time.setMinute(timeMinutes);
		time.setSecond(timeSeconds);
		
		return time;
	}

}
