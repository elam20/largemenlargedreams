public class features_not_bugs extends BST{
    /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
    {
    	return search(target, _root);
    }
    TreeNode search( int target, TreeNode curNode){
    	if(target == curNode.getValue()){
    		return curNode;
    	}
    	else if(target > curNode.getValue() && curNode.getRight() != null){
    		return search(target, curNode.getRight());
    	}
    	else if(target < curNode.getValue() && curNode.getLeft() != null){
    		return search(target, curNode.getLeft());
    	}
    	else{
    		return null;
    	}
    }


    /*****************************************************
     * int height()
     * returns height of this tree (length of longest leaf-to-root path)
     * eg: a 1-node tree has height 1
     *****************************************************/
    public int height()
    {
    	return height(_root);
    }
    public int height(TreeNode curNode){
	if(curNode == null){
		return 0;
		//height may be 1 off, test if it should be 0 or -1
	}
    	else if(height(curNode.getLeft()) > height(curNode.getRight())){
    		return height(curNode.getLeft());
    	}
    	else{
    		return height(curNode.getRight());
    	}

    }


    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/

    public int numLeaves()
    {
    	return numLeaves(_root, 0);
    }

    public int numLeaves(TreeNode curNode, int curLeaves){
    	if(curNode.getLeft() != null){
    		curLeaves = numLeaves(curNode.getLeft(), curLeaves);
    	}
    	if(curNode.getRight() != null){
    		curLeaves = numLeaves(curNode.getRight(), curLeaves);
    	}
        return numLeaves(curNode, curLeaves + 1);
    }

}
