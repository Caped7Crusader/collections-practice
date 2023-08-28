package predefinedFunctionalInterface;

import java.util.function.Function;

public class functionApply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello";
		Function<String, Integer> f = s -> str.length();
		int length = f.apply(str);
		System.out.println(length);
	}

}
