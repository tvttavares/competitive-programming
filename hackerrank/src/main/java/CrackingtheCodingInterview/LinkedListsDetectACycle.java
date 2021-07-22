package CrackingtheCodingInterview;

 
public class LinkedListsDetectACycle {

	class Node {
		Node next;

		Node(int data) {
			next = null;
		}
	}
	
	boolean hasCycle(Node head) {
	    if (head == null) return false;
	    
	    Node slow = head;
	    Node fast = head.next;
	    while (slow != fast) {
	        if (fast == null || fast.next == null) return false;
	        
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    
	    return true;
	}

}
