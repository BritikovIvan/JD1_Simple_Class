package by.htp.task1.logic;

import by.htp.task1.entity.Test1;

public class Test1Logic {
	public int sum(Test1 test1) {
		int sum;
		
		sum = test1.getX() + test1.getY();
		
		return sum;
	}
	
	public int max(Test1 test1) {
		int x = test1.getX();
		int y = test1.getY();
		
		return (x > y) ? x : y;
	}
}
