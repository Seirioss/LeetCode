package PalindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
		int length = 0;
		boolean result = false;
		boolean sign = true;
		int tail = 0;
		int rest = x;
		int head = 0;
		
		if(x < 0) return false;
		else if(x < 10) return true;
		
		for(int i = 0; ; i++) {
			if(x == 0) break;
			x = x / 10;
			length ++;
		}
		
		int power = length - 1;
		
		for(int i = 0; i < length; i++) {
			
			tail = rest % 10;
			head = (int) (rest / Math.pow(10, power));
			rest = (int) (rest - tail * Math.pow(10, power) - tail) / 10;	
			power -= 2;
			
			if( head != tail) return false;
			else if(rest < 0) return true;
			
		}
		
		if(rest != tail) return false;
		else return true;
	}
}
