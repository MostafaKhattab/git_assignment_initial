
package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.PrintStyle;
import git_assignment_initial.Topic;
// Please read CicleArea.java Code and implement as a clone of it but using your formula

public class CircleCircumference implements ITopic {
	private int input;
    public CircleCircumference(){
    	this.input=0;
    }
	public static double GetCircleCircumference(int input) {
		double pi=3.1415;
		  double circumference= pi * 2*input;
	      return circumference; 
	}

	@Override
	public String NotifyTopic(Topic topic) {
        long ans =GetCircleCircumference(int input);
		String output = PrintStyle.print(input, "CircleCircumference") + ans;
        return output;
	}

	
	
}
