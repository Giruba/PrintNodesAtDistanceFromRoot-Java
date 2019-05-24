package BinaryTree;

public class BinaryTree {
	private BinaryTreeNode root;
	
	public BinaryTree(BinaryTreeNode binaryTreeNode) {
		this.root = binaryTreeNode;
	}
	
	public void SetBinaryTreeRoot(BinaryTreeNode binaryTreeNode) {
		this.root = binaryTreeNode;
	}
	
	public BinaryTreeNode GetBinaryTreeRoot() {
		return this.root;
	}
	
	public BinaryTreeNode Insert(BinaryTreeNode binaryTreeNode, int data) {
		
		if(binaryTreeNode == null) {
			binaryTreeNode = new BinaryTreeNode(data);
			return binaryTreeNode;
		}
		
		if(binaryTreeNode.GetBinaryTreeNodeData() < data) {
			binaryTreeNode.SetBinaryTreeNodeRight(Insert(binaryTreeNode.GetBinaryTreeNodeRight(), data));
		}else {
			binaryTreeNode.SetBinaryTreeNodeLeft(Insert(binaryTreeNode.GetBinaryTreeNodeLeft(), data));
		}
		
		return binaryTreeNode;
	}
	
	public void PrintInorderTraversal(BinaryTreeNode binaryTreeNode) {
		if(binaryTreeNode == null) {
			return;
		}
		PrintInorderTraversal(binaryTreeNode.GetBinaryTreeNodeLeft());
		System.out.println(binaryTreeNode.GetBinaryTreeNodeData()+" ");
		PrintInorderTraversal(binaryTreeNode.GetBinaryTreeNodeRight());
	}
	
	public void PrintNodesAtDistanceKFromRoot(BinaryTreeNode binaryTreeNode, int K) {
		if(binaryTreeNode == null) {
			return;
		}
		
		if(K==0) {
			System.out.print(binaryTreeNode.GetBinaryTreeNodeData()+" ");
		}else {
			PrintNodesAtDistanceKFromRoot(binaryTreeNode.GetBinaryTreeNodeLeft(), K-1);
			PrintNodesAtDistanceKFromRoot(binaryTreeNode.GetBinaryTreeNodeRight(), K-1);
		}
	}
}
