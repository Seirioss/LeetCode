package LongestCommonPrefix;

public class MiniSolution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder maxprefix = new StringBuilder(strs[0]);
		
		if(strs.length == 1) return strs[0];
		
		for(int i = 1; i < strs.length; i++) {
		    if(strs[i].equals("")) return "";
			char[] currString = strs[i].toCharArray();
			for(int j = 0; j < Math.min(maxprefix.length(),currString.length); j++) {
				if(maxprefix.charAt(j) != currString[j]) {
					maxprefix.delete(j , maxprefix.length());
				}
				
			}
			if(maxprefix.length() > currString.length ) {
				maxprefix.delete((currString.length), maxprefix.length());
			}
			
		}
		return maxprefix.toString();
    }
}