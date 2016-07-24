package TwoSum;

public class Verification {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = { 2, 7, 11, 15};
		int[] result = new int[2];
		
		
		int target = 9;
		result = solution.twosum(nums, target);
		System.out.println( "The result is:" + result[1]);
	}
}
