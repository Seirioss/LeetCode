package TwoSum;

public class Solution {
	int[] result = new int[2];
	Boolean isFound = false; 
	public int[] twosum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length ; j++ ) {
				if ((nums[i] + nums[j]) == target) {
					result[0] = i;
					result[1] = j;
					isFound = true;
					break;
 				}
			}
			if (isFound) break;
			else System.out.println("No Match found!");		
		}
		return result;
	}
}
