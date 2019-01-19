package offer.title07;


public class MainTest {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(4);
		TreeNode n4 = new TreeNode(5);
		TreeNode n5 = new TreeNode(6);
		TreeNode n6 = new TreeNode(7);
		TreeNode n7 = new TreeNode(8);
		
		root.setLeft(n1);
		root.setRight(n2);
		n1.setLeft(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setRight(n6);
		n5.setLeft(n7);
		
		PrintAndRestore.printTree(root);
	}

}
