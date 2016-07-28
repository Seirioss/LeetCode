package ValidParentheses;

public class Solution {
	public boolean isValidParentheses(String s) {
		char[] buff = s.toCharArray();
		
		if(buff[0] == ')' || buff[0] == ']' || buff[0] == '}') return false;
		//else if( buff[buff.length -1] == '(' || buff[buff.length -1] == '[' || buff[buff.length -1] == '{') return false;
		else if(buff.length <= 1) return false;
		
		for(int i = 0; i < buff.length - 1 ; i++) {
			switch(buff[i]) {
			case '(' : {
				if(buff[i + 1] == ')') i++; 
				else return false;
				break;
			}
			case '[' : {
				if(buff[i + 1] == ']') i++; 
				else return false;
				break;
			}
			case '{' : {
				if(buff[i + 1] == '}') i++; 
				else return false;
				break;
			}
			}
		}
		
		return true;
	}
}
