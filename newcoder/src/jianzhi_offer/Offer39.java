package jianzhi_offer;

import java.util.HashMap;

import jianzhi_offer.Offer4.TreeNode;

public class Offer39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root=new Offer4().new TreeNode(2);
		TreeNode L=new Offer4().new TreeNode(1);
		TreeNode R=new Offer4().new TreeNode(4);
		TreeNode R_L=new Offer4().new TreeNode(3);
		root.left=L;
		root.right=R;
		R.left=R_L;
		System.out.println(BinarySearchtree(root));
	}
	//�ж��Ƿ��Ƕ���ƽ����
	/*
	 * �����㣺
	 * 1������ƽ����һ����һ�Ŷ���������
	 * 2������ƽ��������һ��������ӽڵ�ĸ߶Ȳ����1	 * 
	 * */
	public boolean IsBalanced_Solution(TreeNode root) {
		
		HashMap<TreeNode,Integer> hm=new HashMap<TreeNode,Integer>();
		
		if(BinarySearchtree(root))
		{
			;
			return Inorder(root);
		}else
			return false;        
    }
	public static boolean BinarySearchtree(TreeNode root)
	{
		//�ж��Ƿ��Ƕ���������
		if(root==null)
		{
			return true;
		}
		if(root.left!=null)
		{	
			if(root.val>root.left.val);else
				return false;
			
		}
		if(root.right!=null)
		{	
			if(root.val<root.right.val);else
				return false;
			
		}
		return BinarySearchtree(root.left)?BinarySearchtree(root.right):BinarySearchtree(root.right);
		
	}
	public static boolean Inorder(TreeNode root)
	{
		if(root==null)
		{
			return true;
		}
		if(Math.abs(TreeDepth(root.left)-TreeDepth(root.right))>1)
		{
			return false;
		}
		return Inorder(root.left)?Inorder(root.right):Inorder(root.right);		
		
	}
	public static int TreeDepth(TreeNode root) {
		
		 if(root==null)		 
			 return 0;		 
		 
		 return TreeDepth(root.left)+1>TreeDepth(root.right)+1?TreeDepth(root.left)+1:TreeDepth(root.right)+1;	        
	 }
}
