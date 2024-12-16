package LeetCodeQues;

public class SortLL {
	Node headNode;
	int height;
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
			height++;
			return;
		}
		Node tempNode = headNode;
		while(tempNode.next != null) {
			tempNode= tempNode.next;
		}
		height++;
		tempNode.next = node;
	}
	
	public void sortLL() {
		bubbleSortLL(headNode,this.height,1);
	}
	
	public void bubbleSortLL(Node node, int row, int col) {
		if(col == row) {
			return;
		}
		if(node.data > node.next.data) {
			int tempNode = node.data;
			node.data = node.next.data;
			node.next.data = tempNode;
		}

		bubbleSortLL(node.next, row, col+1);
		bubbleSortLL(headNode, row-1, 1);
	}
	
	public void printLL() {
		Node tempNode = headNode;
		while(tempNode.next!=null) {
			System.out.print(tempNode.data + " -> ");
			tempNode= tempNode.next;
		}
		System.out.print(tempNode.data);
		System.out.println();
	}
}
class Main{
	public static void main(String[] args) {
		SortLL sort = new SortLL();
		sort.insert(3);
		sort.insert(1);
		sort.insert(2);
		sort.insert(4);
		sort.insert(5);
		sort.printLL();
		sort.sortLL();
		sort.printLL();
	}
}

