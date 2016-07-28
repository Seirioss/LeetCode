package LongestCommonPrefix;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		StringBuilder currprefix = new StringBuilder("");
		String maxprefix = "";
		int currlength = 0;
		int maxlength = 0;
		
		if(strs.length == 1) return strs[0];
		
		for(int i = 0; i < strs.length - 1; i++) {
			if(strs[i].equals("")) return "";
			char[] currString = strs[i].toCharArray();
			for(int j = i + 1; j < strs.length ; j++) {
				char[] nextString = strs[j].toCharArray();
				for(int k = 0; k < Math.min(currString.length, nextString.length); k++) {
					if(currString[k] == nextString[k]) {
						currprefix.append(currString[k]);
						
					} else {
						currlength = k;
						break;
					}
				}
				if (currlength >= maxlength) {
					maxprefix = currprefix.toString();
					maxlength = currlength;
				}
				currprefix.delete(0, currprefix.length());
			}
			
		}
		
		return maxprefix;
	}
}
