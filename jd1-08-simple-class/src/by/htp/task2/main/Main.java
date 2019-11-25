package by.htp.task2.main;

import by.htp.task2.entity.Test2;
import by.htp.task2.view.Test2Printer;

public class Main {

	public static void main(String[] args) {
		Test2 test2_1 = new Test2();
		Test2 test2_2 = new Test2(2, 3);
		Test2Printer printer = new Test2Printer();
		
		printer.print(test2_1);
		System.out.println();
		printer.print(test2_2);
	}

}
