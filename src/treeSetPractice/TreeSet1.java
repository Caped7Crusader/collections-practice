package treeSetPractice;

import java.util.TimeZone;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(152);
		ts.add(185);
		ts.add(254);
		ts.add(10);
		ts.add(132);
		ts.add(154);
		ts.add(10);
		System.out.println(ts);	
		System.out.println(ts.comparator());

		TreeSet<Integer> tsc = new TreeSet<>(new MySorting());
		tsc.add(152);
		tsc.add(185);
		tsc.add(254);
		tsc.add(10);
		tsc.add(132);
		tsc.add(154);
		tsc.add(10);
		System.out.println(tsc);	
		System.out.println(tsc.comparator());

	}

}
