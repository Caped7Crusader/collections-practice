package generics;

public class DemoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataObject d1 = new DataObject("String");
		DataObject d2 = new DataObject(10);
		int data = (int)d1.getData();  //ClassCastException d1 is of type string we are casting it to int to retify it use generic class
		System.out.println(data);

	}

}
