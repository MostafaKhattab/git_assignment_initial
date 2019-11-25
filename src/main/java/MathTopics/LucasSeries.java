package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.PrintStyle;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class LucasSeries implements ITopic {
    public static long GetLucas(int n) {
         if (n == 0) 
                return 2; 
            if (n == 1) 
                return 1; 

            // recurrence relation 
            return GetLucas(n - 1) +
                   GetLucas(n - 2); 
    }

    @Override
    public String NotifyTopic(int input) {
        long ans = GetLucas(input);
        String output = PrintStyle.print(input, "Lucas") + ans;
        return output;
    }
}
