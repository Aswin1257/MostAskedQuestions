package LeetCodeQues;


public class ReverseLinkList {
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
		if(headNode == null) {
			headNode = node;
			return;
		}
		Node tempNode = headNode;
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		tempNode.next = node;
	}
	
	public Node reverseLinkList(Node rootNode) {
		if(rootNode.next == null) {
			headNode = rootNode;
			return headNode;
		}
		Node lastNode = reverseLinkList(rootNode.next);
		lastNode.next = rootNode; 
		rootNode.next = null;
		return rootNode;
	}
	
	//Second method
	 public Node reverseLL(Node rootNode) {
		 if(rootNode.next == null) {
			 headNode = rootNode;
			 return headNode;
		 }
		 Node lastNode = reverseLL(rootNode);
		 lastNode.next= rootNode;
		 return rootNode;
	 }
}
