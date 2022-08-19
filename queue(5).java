import java.util.*;
import java.io.*;
public class GFG {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("1");
		pq.add("2");
		pq.add("3");
		pq.add("4");
		pq.add("5");
		pq.add("6");

	System.out.println("Initial Queue " + pq);

		pq.remove("1");
		pq.remove("2");

		System.out.println("After Remove " + pq);
		
		Queue<String> pq1 = new PriorityQueue<>();
		pq1.add("1");
		pq1.add("2");
		pq1.add("3");
		pq1.add("4");
		pq1.add("5");
		pq1.add("6");
		
		System.out.println("Final  Output(New queue)" + pq1);

		
	}
}
