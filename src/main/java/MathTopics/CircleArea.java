package MathTopics;

import git_assignment_initial.*;

public class CircleArea implements ITopic {

	public static double GetCircleArea(int r) {
		return (double) (22 * r * r) / 7;
	}

	@Override
	public String NotifyTopic(int input) {
		double ans = GetCircleArea(input);

		String output = PrintStyle.print(input, "Circle Area") + ans;

		return output;
	}
}
