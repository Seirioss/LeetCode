package StringToInteger;

public class Verification {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String str = "-2147483647";
		int result = solution.myAtoi(str);
		System.out.println(result);
	} 
}
