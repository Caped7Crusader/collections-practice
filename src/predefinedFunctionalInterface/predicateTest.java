package predefinedFunctionalInterface;

import java.util.function.Predicate;

public class predicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int salary = 1000;
		Predicate<Integer> p = s -> s >= 4000;
		boolean result = p.test(salary);
		System.out.println(result);
	}

}
