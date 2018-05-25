package lists;

public class Problem01_04 {
	/*
	 * Problem 1_01
	 * Find the last element of a list.
	 */
	public static Node lastListElement(Node root) {
		Node temp = root;
		while( temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	/*
	 * Problem 1_02
	 * Get the second last element
	 * 
	 * I think nThElementFromLast will be a better method instead of
	 * second last element.
	 */
	public static Node nthElementFromLast(Node root,int nthPosition) {
		
		return null;
	}
	
	
	/*
	 * Problem 1_05
	 * Reverse a single linked list
	 * 
	 */
	public static Node reverseLinkedList(Node cur,Node nxt,Node prev) {
		
		if(cur == null) {
			return prev;
		}
		
		nxt = cur.getNext();
		cur.setNext(prev);
		prev = cur;
		cur =nxt;
		
		return reverseLinkedList(cur, nxt, prev);
	}
}
