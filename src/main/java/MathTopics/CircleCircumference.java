package MathTopics;

import git_assignment_initial.ITopic;

// Please read CicleArea.java Code and implement as a clone of it but using your formula

public class CircleCircumference implements ITopic  {
	 static double circumference(double r){ 
		  
	        double PI = 3.1415; 
	        double cir = 2*PI*r; 
	        return cir; 
	    } 

	@Override
	public String NotifyTopic(int r) {

		
		
		
		long ans = circumference(input);
		ans=Math.round(circumference(r) * 1000) / 1000.0;
                 String output = PrintStyle.print(input, "Circumference") + ans;
                 return output;
	}

}
