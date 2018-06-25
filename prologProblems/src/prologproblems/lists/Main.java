package prologproblems.lists;

public class Main {

	public static void main(String[] args) {
		Node root =new Node(1);
		
		SingleLinkedList sList = new SingleLinkedList(root);
		sList.insert(new Node(2));
		sList.insert(new Node(3));
		sList.insert(new Node(4));
		
		sList.printList();
		
		Node rNode = Problem01_04.reverseLinkedList(sList.getRoot(), null, null);
		sList.setRoot(rNode);
		System.out.println();
		sList.printList();
	}

}
