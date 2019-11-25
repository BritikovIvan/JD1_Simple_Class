package by.htp.task1.main;

import by.htp.task1.entity.Test1;
import by.htp.task1.view.Test1Printer;

public class Main {

	public static void main(String[] args) {
		Test1 test1 = new Test1(2, 3);
		Test1Printer printer = new Test1Printer();
		
		printer.print(test1);
		printer.printMax(test1);
		printer.printSum(test1);
	}

}
