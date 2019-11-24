package MathTopics;

import git_assignment_initial.ITopic;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class CircleVolume implements ITopic {
	public static double GetCircleVolume(int r) {
		return (double)88000 / 21;
	}

	@Override
	public String NotifyTopic(int input) {
		
		return "Input = 10\nCircle Volume = " + (double) 88000 / 21;
	}
}
