package LeetCodeQues;


public class InvertBinaryTree {
	Node rootNode;
	class Node{
		private int value;
		private Node left;
		private Node right;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node left, Node right) {
			this.value =value;
			this.left = left;
			this.right= right;
		}
	}
	
	public void invertBT(Node rootNode) {
		if(rootNode == null) {
			return;
		}
		Node tempNode = rootNode.left;
		rootNode.left= rootNode.right;
		rootNode.right= tempNode;
		invertBT(rootNode.left);
		invertBT(rootNode.right);
		
		
	}
}
