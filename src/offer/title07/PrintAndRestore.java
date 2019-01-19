package offer.title07;

import java.security.acl.LastOwnerException;
import java.util.LinkedList;

public class PrintAndRestore {
	
	public static void printTree(TreeNode root) {
		
		LinkedList<TreeNode> list = new LinkedList<>();
		list.add(root);
		TreeNode currentLastNode = root;
		TreeNode nextLastNode = null;
		
		while(!list.isEmpty()) {
			TreeNode node = list.poll();
			
			if(node.getLeft()==null && node.getValue() != -1) {
				TreeNode newNode = new TreeNode(-1);
				list.add(newNode);
				nextLastNode = newNode;
			}
			if(node.getLeft()!=null) {
				list.add(node.getLeft());
				nextLastNode = node.getLeft();
			}

			if(node.getRight()==null && node.getValue() != -1) {
				TreeNode newNode = new TreeNode(-1);
				list.add(newNode);
				nextLastNode = newNode;
			}
			if(node.getRight()!=null) {
				list.add(node.getRight());
				nextLastNode = node.getRight();
			}
			
			System.out.print(node.getValue() + "  ");
			if(currentLastNode == node) {
				System.out.print("\n");
				currentLastNode = nextLastNode;
			}
		}
		
	}

}
