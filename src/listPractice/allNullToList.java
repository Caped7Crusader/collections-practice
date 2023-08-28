package listPractice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class allNullToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add(null);
		al.add(10);
		al.add("ks");
		System.out.println(al);
		System.out.println("-------------------");
		
		LinkedList ll = new LinkedList(al);
		ll.set(1, 16);
		ll.add(1, true);
		System.out.println(ll);
		System.out.println("-------------------");
	
		Stack s = new Stack();
		s.push(10);
		s.push(true);
		s.push(30);
		s.add("kk");
		System.out.println(s);
		System.out.println(s.search(10));
		System.out.println("-------------------");

		
		Vector v = new Vector();
		v.add(3);
		v.add(5);
		v.add(true);
		v.add("k");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		System.out.println("-------------------");
		
		
	}

}
