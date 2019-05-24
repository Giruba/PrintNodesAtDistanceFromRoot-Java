package Application;

import java.util.Scanner;
import BinaryTree.BinaryTree;

public class Main {
	public static void main(String[] args) {
		System.out.println("Print nodes at K distance from root of tree");
		System.out.println("-------------------------------------------");
		
		try {
			System.out.println("Enter the number of nodes in the binary tree");
			Scanner scanner = new Scanner(System.in);
			int sizeOfTree = scanner.nextInt();
			BinaryTree binaryTree = new BinaryTree(null);
			for(int index = 0; index < sizeOfTree; index++) {
				System.out.println("Enter the element "+(index+1));
				binaryTree.SetBinaryTreeRoot(binaryTree.Insert(binaryTree.GetBinaryTreeRoot(), scanner.nextInt()));
			}
			binaryTree.PrintInorderTraversal(binaryTree.GetBinaryTreeRoot());
			System.out.println("Enter the distance from root, so that nodes at the distance can be printed");
			int distanceFromRoot = scanner.nextInt();
			System.out.println("Nodes at distance["+distanceFromRoot+"] are");
			binaryTree.PrintNodesAtDistanceKFromRoot(binaryTree.GetBinaryTreeRoot(), distanceFromRoot);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
}
