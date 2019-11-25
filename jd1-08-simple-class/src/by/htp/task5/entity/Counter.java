package by.htp.task5.entity;

public class Counter {
	private int value;
	private int maxValue;
	private int minValue;

	public Counter() {
		this.value = 0;
		this.maxValue = Integer.MAX_VALUE;
		this.minValue = Integer.MIN_VALUE;
	}

	public Counter(int value) {
		this.value = value;
		this.maxValue = Integer.MAX_VALUE;
		this.minValue = Integer.MIN_VALUE;
	}

	public Counter(int value, int maxValue, int minValue) {
		this.value = value;
		this.maxValue = maxValue;
		this.minValue = minValue;
	}

	public int increment() {
		if (value < maxValue) {
			value++;
		}
		return value;
	}

	public int decrement() {
		if (value > minValue) {
			value--;
		}
		return value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value >= minValue) {
			if (value <= maxValue) {
				this.value = value;
			} else {
				this.value = maxValue;
			}
		} else this.value = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxValue;
		result = prime * result + minValue;
		result = prime * result + value;
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
		Counter other = (Counter) obj;
		if (maxValue != other.maxValue)
			return false;
		if (minValue != other.minValue)
			return false;
		if (value != other.value)
			return false;
		return true;
	}

}
