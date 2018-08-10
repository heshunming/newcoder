package jianzhi_offer;

import jianzhi_offer.Offer4.TreeNode;

public class Offer38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new Offer4().new TreeNode(0);
		TreeNode L=new Offer4().new TreeNode(0);
		TreeNode R=new Offer4().new TreeNode(0);
		TreeNode R_L=new Offer4().new TreeNode(0);
		root.left=L;
		root.right=R;
		R.left=R_L;
		System.out.println(TreeDepth(root));
		
	}
	 public static int TreeDepth(TreeNode root) {
		
		 if(root==null)		 
			 return 0;		 
		 
		 return TreeDepth(root.left)+1>TreeDepth(root.right)+1?TreeDepth(root.left)+1:TreeDepth(root.right)+1;	        
	 }

}
