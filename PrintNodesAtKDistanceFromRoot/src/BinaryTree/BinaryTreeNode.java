package BinaryTree;

public class BinaryTreeNode {
	private int data;
	private BinaryTreeNode leftNode;
	private BinaryTreeNode rightNode;
	
	public BinaryTreeNode(int data) {
		this.data = data;
	}
	
	public void SetBinaryTreeNodeData(int data) {
		this.data = data;
	}
	
	public void SetBinaryTreeNodeLeft(BinaryTreeNode leftNode) {
		this.leftNode = leftNode;
	}
	
	public void SetBinaryTreeNodeRight(BinaryTreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	public int GetBinaryTreeNodeData() {
		return data;
	}
	
	public BinaryTreeNode GetBinaryTreeNodeLeft() {
		return leftNode;
	}
	
	public BinaryTreeNode GetBinaryTreeNodeRight() {
		return rightNode;
	}
}
