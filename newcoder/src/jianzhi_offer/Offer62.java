package jianzhi_offer;

import java.util.ArrayList;

import jianzhi_offer.Offer4.TreeNode;

public class Offer62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new Offer4().new TreeNode(0);
		TreeNode node1=new Offer4().new TreeNode(1);
		TreeNode node2=new Offer4().new TreeNode(2);
		TreeNode node3=new Offer4().new TreeNode(3);
		TreeNode node4=new Offer4().new TreeNode(4);
		TreeNode node5=new Offer4().new TreeNode(5);
		root.left=node1;
		root.right=node2;
		node1.left=node3;
		node1.right=node4;
		node2.left=node5;
		System.out.println(KthNode(root, 2).val);
	}
	static TreeNode KthNode(TreeNode pRoot, int k)
	{
		
		 if(pRoot==null)		 
			 return pRoot;		
		 ArrayList<TreeNode>arr=new ArrayList<Offer4.TreeNode>();
		 Presearch(pRoot,arr);
		 if(k>arr.size())		 
			 return null;		 
		 return arr.get(k-1);
	        
	}
	 static void  Presearch(TreeNode root,ArrayList<Offer4.TreeNode>arr)
	 {
		 if(root==null)
		 {
			 return;
		 }
		 Presearch(root.left,arr);
		 arr.add(root);
		 Presearch(root.right,arr);
	 }

}
