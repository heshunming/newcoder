package jianzhi_offer;

import jianzhi_offer.Offer4.TreeNode;

public class Offer17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	//简洁代码，
	 public boolean findroot(TreeNode root1,TreeNode root2)
	 {
		
		 if(root2==null)
		 {
			 return true;
		 }
		 if(root1==null)
		 {
			 return false;
		 } 
		
		 if(root1.val==root2.val)
		 {
			 return findroot(root1.left, root2.left)&&findroot(root1.right, root2.right);
		 }else 
			 return false; 
		
	  }
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2)
		{
		if (root1 ==null|| root2 ==null) return false;
		return findroot(root1, root2) ||HasSubtree(root1.left, root2) ||HasSubtree(root1.right, root2);
		 }

}
