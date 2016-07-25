package ReverseInteger;

public class Solution {
	public int reverse(int x) {
		int[] buff = new int[10];
		int temp = x;
		int count = 0;
		int result = 0;
		
		for(int i = 0; i < buff.length; i++) {
			if(temp == 0) break;
			buff[i] = temp % 10;
			temp = temp / 10;
			count++;			
		}
		
		int length = count;
		
		
			for(int i = 0; i < length; i++) {
				result += buff[i] * Math.pow(10, count-1);
				count--;
			}
		
		if(result >= 2147483647 || result <= -2147483647) result = 0;
		
		return result;
		
	}
}
