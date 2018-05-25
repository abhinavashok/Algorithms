package lists;

public class SingleLinkedList {
	private Node root;
	
	public SingleLinkedList(Node node){
		this.root = node;
	}
	
	public void setRoot(Node node) {
		this.root = node;
	}
	
	public Node getRoot() {
		return this.root;
	}
	public void insert( Node node) {
		Node temp = this.root;
		while( temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(node);
	}
	
	public int delete() {
		Node prev = this.root;
		Node cur = this.root;
		while( cur.getNext() != null) {
			prev = cur;
			cur = cur.getNext();
		}
		prev.setNext(null);
		return cur.getData();
	}
	
	public void printList() {
		Node temp = this.root;
		while( temp.getNext() != null) {
			System.out.print(temp.getData()+"->");
			temp = temp.getNext();
		}
		System.out.print(temp.getData());
	}
}
