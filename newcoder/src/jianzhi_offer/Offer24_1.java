package jianzhi_offer;

import java.util.ArrayList;
import java.util.Stack;
import jianzhi_offer.Offer4.TreeNode;

public class Offer24_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new Offer4().new TreeNode(0);
		TreeNode node1=new Offer4().new TreeNode(1);
		TreeNode node2=new Offer4().new TreeNode(2);
		TreeNode node3=new Offer4().new TreeNode(3);
		TreeNode node4=new Offer4().new TreeNode(1);
		TreeNode node5=new Offer4().new TreeNode(2);
		TreeNode node6=new Offer4().new TreeNode(3);
		root.left=node1;
		root.right=node3;
		root.left.right=node2;
		node2.left=node4;
		System.out.println(maxDistance(root));
		//		
//		ArrayList<Integer> pathlist=new ArrayList<>();
//		Stack<Integer>stack=new Stack<Integer>();
//		path(root,3,pathlist,stack);
//		for(int e:pathlist){System.out.print(e+" ");}
	}
	public static void path(TreeNode root,int key,ArrayList<Integer>list,Stack<Integer>stack)
	{
		if(root==null)return;
		if(root.val==key)
		{
			for(int e:stack)
			{
				list.add(e);
			}
		}
		if(root.left==null&&root.right==null)
			return;
		else
		{
			stack.push(root.val);
			path(root.left,key,list,stack);
			path(root.right,key,list,stack);
			stack.pop();
		}
		return;
	}

	//二叉树的最大距离
	public static int maxDistance(TreeNode root)
	{
		if(root==null)return 0;
		int left=0;
		int right=0;
		if(root.left!=null)left=FindMaxDistance(root.left)+1;
		if(root.right!=null)right=FindMaxDistance(root.right)+1;
		System.out.println(left+":"+right);
		return left+right;
	}
	public static int FindMaxDistance(TreeNode root){
		
		if(root==null)
			return 0;
		int leftMax=0,rightMax=0;
		if(root.left!=null)
			 leftMax=FindMaxDistance(root.left)+1;
		if(root.right!=null)
			 leftMax=FindMaxDistance(root.right)+1;
		 return Integer.max(leftMax,rightMax);
	}

}
