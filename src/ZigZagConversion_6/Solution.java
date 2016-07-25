package ZigZagConversion_6;

public class Solution {
	public String convert(String s, int numRows) {
		char[] input = s.toCharArray();
		char[][] trans = new char[numRows][100];
		char[] output = new char[100];
		String result = "";
		for(int i = 0; ; i++) {
			if(i % 2 != 1) {
				for(int j = 0; j < numRows; j++){
					if (((i / 2) * (numRows + 1) + j) >= input.length) break;
					trans[j][i] =  input[(i / 2) * (numRows + 1) + j];
				}
			} else {
				if(((i + 1) / 2) * numRows + i -1 >= input.length) break;
				trans[(numRows - 1) / 2 ][i] = input[((i + 1) / 2) * numRows + (i - 1) / 2];
			}
		} 
		
		for(int i = 0; i < trans.length; i++){
			for(int j = 0; j < trans[i].length; j++){
				if(trans[i][j] > 0) {
					result += Character.toString(trans[i][j]);
				}
			}
		}

		return String.valueOf(result);
	}
}


