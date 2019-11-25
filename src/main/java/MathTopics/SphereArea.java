package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.PrintStyle;

public class SphereArea implements ITopic {
	public static double GetShpereArea(int r) {
		return (double) 4 * 22 / 7 * Math.pow(r, 2);
	}

	@Override
	public String NotifyTopic(int input) {
		double ans = GetShpereArea(input);
		String output = PrintStyle.print(input, "Sphere Area") + ans;
		return output;
	}

}
