package LeetCodeQues;

public class ReverseLL {
	 Node headNode;
	 class Node{
		 private int data;
		 private Node next;
		 public Node(int data) {
			this.data =data;
		}
	 }
	 
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
