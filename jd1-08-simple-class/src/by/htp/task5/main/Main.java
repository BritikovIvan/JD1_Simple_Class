package by.htp.task5.main;

import by.htp.task5.entity.Counter;

public class Main {
	
	public static void main(String[] args) {
		Counter counter1 = new Counter(3);
		Counter counter2 = new Counter();
		
		System.out.println(counter1.increment());
		System.out.println(counter2.decrement());
	}
	
}
