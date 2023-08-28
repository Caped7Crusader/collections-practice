package listPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortDsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArr = {5,7,0,3,2};
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, intArr);

		Collections.sort(list, (o1,o2) -> {
			if(o1 > o2) {
				return -1;
			}else if(o1 < o2){
				return 1;
		    }else{
				return 0;
			}
			
		});
		
		System.out.println(list);
	}

}
