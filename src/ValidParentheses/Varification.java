package ValidParentheses;

public class Varification {
	public static void main(String[] args) {
		MajorSolution solution = new MajorSolution();
		String input = "[{()}]";
		System.out.println(solution.isValidParentheses(input));
	}
}

