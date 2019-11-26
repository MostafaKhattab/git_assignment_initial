package MathTopics;
import git_assignment_initial.*;
import git_assignment_initial.ITopic;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class TwoPowerN implements ITopic {
	public static long Get2PN(int n) {
		 return (long)(2 ^ n);
	}

	@Override
	public String NotifyTopic(int input) {
               long ans = Get2PN(input);
	       String output = PrintStyle.print(input, "2PN") + ans;
	       return output;
		
	}
}
