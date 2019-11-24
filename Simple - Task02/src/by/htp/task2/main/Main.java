package by.htp.task2.main;

import by.htp.task2.entity.Test1;
import by.htp.task2.logic.Test1logic;
import by.htp.task2.view.Test1View;

public class Main {

	public static void main(String[] args) {
		
		Test1 test = new Test1();
		
		test.setOne(10);
		test.setTwo(25);

		Test1 initSetGet = new Test1();
		Test1logic testSumMax = new Test1logic();
		
		initSetGet.setOne(testSumMax.test1Sum(test));
		initSetGet.setTwo(testSumMax.test1max(test));
		
		Test1View printer = new Test1View();
		
		printer.print(test);
		
		printer.sumPrinter(test, initSetGet);
		printer.maxPrinter(test, initSetGet);

	}

}
