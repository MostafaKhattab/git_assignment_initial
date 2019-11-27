package MathTopics;

import git_assignment_initial.ITopic;

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
	public String Factorial(int n) {

		return "Input = 10\nFactorial = " + GetFactorial(int n);
	}
}
