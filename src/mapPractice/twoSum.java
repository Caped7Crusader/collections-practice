package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,11,2,23,13,7};
		int target = 9;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				int index1 = map.get(complement);
                int index2 = i;
                System.out.println("Indices: " + index1 + ", " + index2);
                break;
			}
			map.put(nums[i], i);  //map replaces the value of the key when the key is already present in the map. so we get 2nd 2 index
		}
		System.out.println(map);
		
	}

}
