package ValidParentheses;

public class MajorSolution {
	public boolean isValidParentheses(String s) {
		StringBuilder buff = new StringBuilder(s);
		//char[] buff = s.toCharArray();
		boolean smalltag = false;
		boolean mediumtag = false;
		boolean bigtag = false;
		
		for(int i = 0; i < buff.length(); i++) {
			
			if(buff.charAt(0) == ')' || buff.charAt(0) == ']' || buff.charAt(0) == '}') return false;
			else if(buff.length() <= 1) return false;
			
			switch(buff.charAt(i)) {

			case ')' : {
				if( buff.charAt(i - 1) == '(') {
					buff.delete(i - 1, i + 1);
					smalltag = false;
					i -= 2;
					break;
				} else return false;
			}

			case ']' : {
				if( buff.charAt(i - 1) == '[') {
					buff.delete(i - 1, i + 1);
					mediumtag = false;
					i -= 2;
					break;
				}
				else return false;
			}

			case '}' : {
				if( buff.charAt(i - 1) == '{') {
					buff.delete(i - 1, i + 1);
					bigtag = false;
					i -= 2;
					break;
				}
				else return false;
			}
			}
			
			System.out.println(buff.toString());
			
		}
		
		if( smalltag || mediumtag || bigtag) return false;
		else return true;
	}
}
