package LeetCodeQues;


public class MergeLL {
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
		Node tempNode= headNode;
		while(tempNode.next!=null) {
			tempNode= tempNode.next;
		}
		tempNode.next= node;
	}
	
	public static MergeLL mergeLL(Node firstNode, Node secondNode) {
		MergeLL mergedLl = new MergeLL();
		Node tempfirst = firstNode;
		Node tempsecond= secondNode;
		while(tempfirst != null && tempsecond != null) {
			if(tempfirst.data < tempsecond.data) {
				mergedLl.insert(tempfirst.data);
				tempfirst = tempfirst.next;
			}else {
				mergedLl.insert(tempsecond.data);
				tempsecond = tempsecond.next;
			}
		}
		
		while(tempfirst != null) {
			mergedLl.insert(tempfirst.data);
			tempfirst = tempfirst.next;
		}
		while(tempsecond != null) {
			mergedLl.insert(tempsecond.data);
			tempsecond = tempsecond.next;
		}
		
		return mergedLl;
	
	}
	
	public static void main(String[] args) {
		MergeLL firsLl = new MergeLL();
		MergeLL secondLl = new MergeLL();
	}
}
