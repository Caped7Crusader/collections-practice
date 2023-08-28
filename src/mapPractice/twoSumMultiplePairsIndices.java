package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twoSumMultiplePairsIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,11,23,6,3,2,8,5,3,5,4,13,7,1};
		int target = 9;
		
        List<List<Integer>> pairsIndices = new ArrayList<>();
        Map<Integer, List<Integer>> numToIndices = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndices.containsKey(complement)) {
                List<Integer> indices = numToIndices.get(complement);
                for (int index : indices) {
                    List<Integer> pairIndices = new ArrayList<>();
                    pairIndices.add(index);
                    pairIndices.add(i);
                    pairsIndices.add(pairIndices);
                    System.out.println(pairIndices + "pairIndices");
                }
                System.out.println(indices + "indices");
            }
            
            numToIndices.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        System.out.println(numToIndices);
        System.out.println(pairsIndices);
		
		for (List<Integer> pair : pairsIndices) {
            int index1 = pair.get(0);
            int index2 = pair.get(1);
            System.out.println("(" + index1 + ", " + index2 + ")");
        }
	}

}
