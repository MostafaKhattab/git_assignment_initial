
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
	public static double GetCircleCircumference(int r) {
		    double PI = 3.1415; 
	        double cir = 2*PI*(double)r; 
	        return cir; 
	}

	@Override
	public String NotifyTopic(Topic topic) {
        this.input=topic.getInput();
        double result = Math.round(GetCircleCircumference(this.input) * 1000) / 1000.0; 
        String output = PrintStyle.print(this.input, "Circle Circumference") + result;
        return output;
	}

}
