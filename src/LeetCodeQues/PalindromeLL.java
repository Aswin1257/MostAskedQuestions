package LeetCodeQues;



public class PalindromeLL {

	Node headNode;
	class Node{
		 int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		if(headNode ==null) {
			headNode= node;
			return;
		}
		Node temNode=headNode;
		while(temNode.next !=null) {
			temNode =temNode.next;
		}
		temNode.next= node;
	}
	
	public boolean palindromLL() {
		
		Node node = reverseHalfLL(headNode, headNode);
		while(headNode != null && node != null) {
			if(headNode.data != node.data) {
				return false;
			}
			headNode= headNode.next;
			node = node.next;
		}
		return true;
	}
	
	public Node reverseHalfLL(Node slow,Node fast) {
		while(fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
		}
		Node prevNode=null;
		Node nextNode=null;
		Node currentNode=slow;
		while(currentNode.next != null) {
			nextNode = currentNode.next;
			currentNode.next= prevNode;
			prevNode= currentNode;
			currentNode= nextNode;
		}

		return currentNode;
	}
	

}
//class Main{
//	public static void main(String[] args) {
//		PalindromeLL palindromeLL = new PalindromeLL();
//		palindromeLL.insert(1);
//		palindromeLL.insert(2);
////		palindromeLL.insert(2);
////		palindromeLL.insert(1);
//////		
////		palindromeLL.insert(2);
//		boolean is = palindromeLL.palindromLL();
//		System.out.println(is);
//	}
//}
