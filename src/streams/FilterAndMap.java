package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArr = {1,2,24,2,5,22,3,12,42,39};
		List<Integer> list = Arrays.asList(intArr);
		
		List<Integer> newList = list.stream().filter(i -> i >= 25).collect(Collectors.toList());
		
		List<Integer> newList1 = list.stream().map(i -> i * 2).collect(Collectors.toList());
		
		System.out.println(list + "\n" + newList + "\n" + newList1);

		long count = list.stream().filter(i -> i >= 25).count();
		System.out.println(count);
	}

}
