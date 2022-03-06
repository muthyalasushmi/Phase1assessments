package assistedprojectsPhase1;
import java.util.*;
public class Queue31 {

	public static void main(String[] args) {
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("HII");
	    locationsQueue.add("HLO");
	    locationsQueue.add("WELCOME");
	    locationsQueue.add("TO");
	    locationsQueue.add("MPHASIS");
	    locationsQueue.add("SEE");
	    locationsQueue.add(" U SOONS");

	    System.out.println("Queue is : " + locationsQueue);
	    System.out.println("Head of Queue : " + locationsQueue.peek());
	    locationsQueue.remove();
	    System.out.println("After removing Head of Queue : " + locationsQueue);
	    System.out.println("Size of Queue : " + locationsQueue.size());
	}
}
	


