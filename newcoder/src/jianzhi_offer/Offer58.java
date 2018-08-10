package jianzhi_offer;

import jianzhi_offer.Offer4.TreeNode;

public class Offer58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 boolean isSymmetrical(TreeNode pRoot)
	 {
		 if(pRoot==null)
		 {
			 return false;
		 }
		 
	     return comp(pRoot.left,pRoot.right);  
	 }
	private boolean comp(TreeNode left,TreeNode right) {
		 if(left==null||right==null)return (left==null)&&(right==null);
		 if(left.val!=right.val)
		 {
			return false;
		 }		
			
			
		return comp(left.left,right.right)&&comp(left.right,right.left);
	}

}
