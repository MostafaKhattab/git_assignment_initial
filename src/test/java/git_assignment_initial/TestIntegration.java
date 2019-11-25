package git_assignment_initial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MathTopics.CircleArea;
import MathTopics.CircleCircumference;
import MathTopics.CircleVolume;
import MathTopics.Factorial;
import MathTopics.Fibonacci;
import MathTopics.LucasSeries;
import MathTopics.SphereArea;
import MathTopics.SummationSeries;
import MathTopics.TwoPowerN;

public class TestIntegration {

	@Test
	public void IntegrationTest() {
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

		String TestRes = topic.DoEvent(10);
		String ans = "Input = 10\nCircle Area = " + (double)2200 / 7
				+ "\nInput = 10\nCircle Circumference = " + (double)440 / 7
				+ "\nInput = 10\nCircle Volume = " + (double)88000 / 21
				+ "\nInput = 10\nFactorial = " + 3628800
				+ "\nInput = 10\nFib = " + 55
				+ "\nInput = 10\nLucas = " + 123
				+ "\nInput = 10\nSphere Area = " + (double)8800 / 7
				+ "\nInput = 10\nSum = " + 55
				+ "\nInput = 10\n2PN = " + 1024
				+ "\n";
		assertEquals(ans, TestRes);
	}
}
