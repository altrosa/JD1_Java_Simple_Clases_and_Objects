package by.htp.task2.view;

import by.htp.task2.entity.Test1;

public class Test1View {
	
	
	public void print (Test1 print) {
		
		System.out.println("Переменная 1: " + print.getOne());
		System.out.println("Переменная 2: " + print.getTwo());
	}
	
	public void sumPrinter (Test1 test1, Test1 sum ) {
		
		System.out.println("Сумма переменных: " + test1.getOne());
	}
	
	public void maxPrinter(Test1 test1, Test1 max) {
		
		System.out.println("Большая переменная: " + test1.getTwo());
	}

}
