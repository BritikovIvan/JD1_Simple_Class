package by.htp.task1.view;

import by.htp.task1.entity.Test1;
import by.htp.task1.logic.Test1Logic;

public class Test1Printer {
	public void print(Test1 test1) {
		System.out.println("x = " + test1.getX());
		System.out.println("y = " + test1.getY());
	}
	
	public void printSum(Test1 test1) {
		int sum;
		Test1Logic logic = new Test1Logic();
		
		sum = logic.sum(test1);
		System.out.println("sum = " + sum);
	}
	
	public void printMax(Test1 test1) {
		int max;
		Test1Logic logic = new Test1Logic();
		
		max = logic.max(test1);
		System.out.println("max = " + max);
	}
}
