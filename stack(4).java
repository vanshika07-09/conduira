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
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		System.out.println("Adding removed elements to stack " + stack);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		System.out.println("Final  Output" + stack);

		
	}
}
