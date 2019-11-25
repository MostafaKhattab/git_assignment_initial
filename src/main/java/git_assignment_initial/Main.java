package git_assignment_initial;

import MathTopics.*;

public class Main {

	public static void main(String[] args) {
		
		// Driver Code
		Topic topic = new Topic();
		
		topic.AddTopic(new CircleArea());
		topic.AddTopic(new CircleCircumference());
		topic.AddTopic(new CircleVolume());
		topic.AddTopic(new Factorial());
		topic.AddTopic(new Fibonacci());
		topic.AddTopic(new LucasSeries());
		topic.AddTopic(new SphereArea());
		topic.AddTopic(new SummationSeries());
		topic.AddTopic(new TwoPowerN());
		
		System.out.println(topic.DoEvent(10));
		
		//System.out.println(topic.DoEvent(1));
		//System.out.println(topic.DoEvent(5));
		//topic.DoEvent(10);
	}
}
