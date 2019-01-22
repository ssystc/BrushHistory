package common.structure.tree.buildtree;

import java.io.PrintWriter;
import java.nio.file.attribute.AclEntry.Builder;
import java.util.ArrayList;
import java.util.List;


public class TreeUtil {
	
	
	//两层循环构建
	public static TreeNode builderByTwoLoop(List<TreeNode> treeNodes){
		TreeNode root = null;
		for (TreeNode treeNode : treeNodes) {
			if(treeNode.getParentId()==0) {
				root = treeNode;
			}
			for(TreeNode it : treeNodes) {
				if(it.getParentId() == treeNode.getId()) {
					if(treeNode.getChildren() == null) {
						treeNode.setChildren(new ArrayList<TreeNode>());
					}
					treeNode.add(it);
				}
			}
		}
		
		return root;
	}
	
	//递归查找子节点
	public static TreeNode findChildren(TreeNode treeNode, List<TreeNode> treeNodes) {
		
		for(TreeNode it : treeNodes) {
			if(treeNode.getId() == it.getParentId()) {
				if(treeNode.getChildren() == null) {
					treeNode.setChildren(new ArrayList<>());
				}
				treeNode.add(findChildren(it, treeNodes));
			}
		}
		return treeNode;
	}
	
	
	//递归构建树
	public static TreeNode buildByRecursive(List<TreeNode> treeNodes) {
		
		TreeNode root = null;
		for(TreeNode treeNode : treeNodes) {
			if(treeNode.parentId == 0) {
				root = treeNode;
				findChildren(root, treeNodes);
			}
		}
		return root;
	}
	

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1, 0);
		TreeNode node2 = new TreeNode(2, 1);
		TreeNode node3 = new TreeNode(3, 1);
		TreeNode node4 = new TreeNode(4, 1);
		TreeNode node5 = new TreeNode(5, 4);
		TreeNode node6 = new TreeNode(6, 4);
		TreeNode node7 = new TreeNode(7, 5);
		List<TreeNode> list = new ArrayList<>();
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		list.add(node5);
		list.add(node6);
		list.add(node7);
//		TreeNode root = builderByTwoLoop(list);
//		System.out.println(root);
		
//		System.out.println(findChildren(node4, list));
		
		System.out.println(buildByRecursive(list));
		
	}


}
