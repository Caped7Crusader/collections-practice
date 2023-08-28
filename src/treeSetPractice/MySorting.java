package treeSetPractice;

import java.util.Comparator;

public class MySorting implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer num1 = (Integer)o1;
		Integer num2 = (Integer)o2;
		
		if(num1 < num2) {
			return +1;
		}else if(num1 > num2) {
			return -1;
		}else {
			return 0;
		}
		
	}

}
