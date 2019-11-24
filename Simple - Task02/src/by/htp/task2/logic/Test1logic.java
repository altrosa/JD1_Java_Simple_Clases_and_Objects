package by.htp.task2.logic;

import by.htp.task2.entity.Test1;

public class Test1logic {

	public int test1Sum(Test1 test) {

		int sum;

		sum = test.getOne() + test.getTwo();

		return sum;

	}

	public int test1max(Test1 test) {

		int max;

		if (test.getOne() > test.getTwo()) {

			max = test.getOne();
		} else {
			max = test.getTwo();
		}
		return max;
	}

}
