package jianzhi_offer;

import jianzhi_offer.Offer4.TreeNode;

public class Offer18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn1=new Offer4().new TreeNode(8);
		TreeNode tn2=new Offer4().new TreeNode(7);
		TreeNode tn3=new Offer4().new TreeNode(6);
		TreeNode tn4=new Offer4().new TreeNode(5);
		TreeNode tn5=new Offer4().new TreeNode(4);
		tn1.left=tn2;
		tn2.left=tn3;
		tn3.left=tn4;
		tn4.left=tn5;
		Mirror(tn1);
	}
	public static void Mirror(TreeNode root) {
	        swap(root);
	}
	public static TreeNode swap(TreeNode root) {
		if(root==null)return null;
		if(root.left==null&&root.right==null)
		{
			return root;
		}
		TreeNode temp=new Offer4().new TreeNode(root.val);
		//TreeNode left=root.left;
		//TreeNode right=root.right;
		//TreeNode left=new Offer4().new TreeNode(0);		
		
		temp.left=root.left;
		temp.right=root.right;
		root.left=swap(root.right);
		root.right=swap(temp.left);		
		temp=null;
		return root;
		//return root;	        
	}

}
