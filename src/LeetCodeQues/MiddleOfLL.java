package LeetCodeQues;


public class MiddleOfLL {
	Node headNode;
	class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		if(headNode==null) {
			headNode=node;
			return;
		}
		Node tempNode= headNode;
		while(tempNode.next!=null) {
			tempNode= tempNode.next;
		}
		tempNode.next=node;
	}
	
	public int findMiddle(Node headNode) {
		Node slowNode= headNode;
		while(headNode !=null&&headNode.next!=null) {
			slowNode= slowNode.next;
			headNode= headNode.next.next;
		}
		return slowNode.data;
	}
	

}
//class Main{
//	public static void main(String[] args) {
//		MiddleOfLL ll = new MiddleOfLL();
//		ll.insert(0);
//		ll.insert(5);
//		ll.insert(24);
//		ll.insert(200);
//		ll.insert(3);
//		ll.insert(65);
//		ll.insert(87);
//		ll.insert(55);
//		ll.insert(9);
//		ll.insert(66);
//		ll.insert(350);
//		System.out.println(ll.findMiddle(ll.headNode));
//	}
//}
