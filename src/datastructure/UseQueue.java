package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {

		Queue<String> fruits = new LinkedList<String>();
		fruits.add("Mango");
		fruits.add("Litchi");
		fruits.add("Jackfruit");
		fruits.add("Banana");
		fruits.remove();
		fruits.peek();
		fruits.poll();

		Iterator it = fruits.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (String ami : fruits) {
			System.out.println("Remove fruits  :" + fruits.remove() + " Peek fruits :" + fruits.peek() + " Poll fruits :" + fruits.poll());

		}






		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */


	}
}