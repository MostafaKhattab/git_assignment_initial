package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.PrintStyle;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class Factorial implements ITopic {
	public static long GetFactorial(int n) {
		 if (n == 0) {
	           return 1;
	       } else {
	           return n * GetFactorial(n - 1);
	       }
	}

	@Override
	public String NotifyTopic(int input) {
                 long ans = GetFactorial(input);
                 String output = PrintStyle.print(input, "Factorial") + ans;
                 return output;
	}
}
