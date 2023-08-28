package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twoSumMultiplePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,11,23,6,3,2,8,5,3,5,4,13,7,1};
		int target = 9;
		
        List<int[]> pairs = new ArrayList<>();
        Map<Integer, List<Integer>> numToIndices = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndices.containsKey(complement)) {
                List<Integer> indices = numToIndices.get(complement);
                for (int index : indices) {
                    pairs.add(new int[]{index, i});
                }
            }
            
            numToIndices.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        for (int[] pair : pairs) {
            System.out.println("(" + nums[pair[0]] + ", " + nums[pair[1]] + ")");
        }
	}

}
