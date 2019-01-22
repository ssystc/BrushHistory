package common.structure.tree.buildtree;

import java.util.ArrayList;
import java.util.List;


public class TreeNode {
	
	protected int id;
    protected int parentId;
    List<TreeNode> children = new ArrayList<TreeNode>();
    
    public TreeNode(int id, int parentId) {
    	this.id = id;
    	this.parentId = parentId;
    }
    
    public TreeNode(int id, int parentId, List<TreeNode> children) {
    	this.id = id;
    	this.parentId = parentId;
    	this.children = children;
    }

    
    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void add(TreeNode node){
        children.add(node);
    }
    
    @Override
    public String toString() {
    	return "TreeNode{" + "id=" + id + ",parentId=" + parentId + ",children=" + children + "}";
    }

}
