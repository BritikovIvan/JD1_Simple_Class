package by.htp.task6.entity;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public static final int TIME_LIMIT = 0;
	public static final int HOUR_LIMIT = 24;
	public static final int MINUTE_AND_SECOND_LIMIT = 60;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public Time(int hour, int minute, int second) {
		if (hour >= TIME_LIMIT && hour <= HOUR_LIMIT) {
			this.hour = hour;	
		} else {
			this.hour = 0;
		}
		
		if (minute >= TIME_LIMIT && minute <= MINUTE_AND_SECOND_LIMIT) {
			this.minute = minute;	
		} else {
			this.minute = 0;
		}
		
		if (second >= TIME_LIMIT && second <= MINUTE_AND_SECOND_LIMIT) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= TIME_LIMIT && hour <= HOUR_LIMIT) {
			this.hour = hour;	
		} else {
			this.hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= TIME_LIMIT && minute <= MINUTE_AND_SECOND_LIMIT) {
			this.minute = minute;	
		} else {
			this.minute = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= TIME_LIMIT && second <= MINUTE_AND_SECOND_LIMIT) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

}
