package RomanToInteger;

public class Solution {
	public int romanToInt(String s) {
		int thousand = 0;
		int handred  = 0;
		int ten = 0;
		int one = 0;
		int result = 0;
		
		char[] buff = s.toCharArray();
		
		for(char c : buff) {
			switch (c) {
			case 'M' : {
				if( handred != 0) {
					result += 900;
					handred = 0;
				} else thousand++;
				
			} ;
			break;
			case 'D' : {
				if( handred != 0) {
					result += 400;
					handred = 0;
				} else result += 500 ;
			};
			break;
			case 'C' : {
				if( ten != 0) {
					result += 90;
					ten = 0;
				} else handred++;
			};
			break;
			case 'L' : {
				if( ten != 0) {
					result += 40;
					ten = 0;
				} else result += 50;
			};
			break;
			case 'X' : {
				if( one != 0) {
					result += 9;
					one = 0;
				} else ten++;
			};
			break;
			case 'V' : {
				if( one != 0) {
					result += 4;
					one = 0;
				} else result += 5;
			};
			break;
			case 'I' : one++;
			}
			
		}
		
		result += thousand * 1000 + handred * 100 + ten * 10 + one * 1;
		return result;
	}
}
