package StringToInteger;

public class Solution {
	public int myAtoi(String str) {
		int result = 0;
		char[] buff = str.toCharArray();
		int start = 0;
		boolean sign = true;
		int symbolcount = 0;
		
		for(int i = 0; i < buff.length; i++) { //start with non-whitespace
			if(buff[i] != ' ') {
				if(buff[i] == 45) {
					sign = false;
                    symbolcount++;
				} else if(buff[i] == 43) {
					sign = true;
					symbolcount++;
				} else if(buff[i] >= 48 && buff[i] <= 57 && symbolcount < 2) {
					start = i;
					result = buff[i] - 48;
					break;
				} else return 0;
			}
		}
		
		for(int i = start + 1; i < buff.length; i++) {
			if( buff[i] >= 48 && buff[i] <= 57 ){
				result = result * 10 + (buff[i] - 48);
			} else break;		
		}

		if(result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
		else if (result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
		else if (sign == false) return ~result + 1;
		else return result;
	}
}
