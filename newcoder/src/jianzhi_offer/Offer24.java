package jianzhi_offer;

import java.util.ArrayList;
import java.util.Stack;

import jianzhi_offer.Offer4.TreeNode;
public class Offer24 {
	public static ArrayList<ArrayList<Integer>>list=new ArrayList<>();
	public static Stack<Integer> stack=new Stack<>();
	public static void main(String[] args) {	
		TreeNode root=new Offer4().new TreeNode(0);
		TreeNode node1=new Offer4().new TreeNode(1);
		TreeNode node2=new Offer4().new TreeNode(2);
		TreeNode node3=new Offer4().new TreeNode(3);
		TreeNode node4=new Offer4().new TreeNode(4);
		TreeNode node5=new Offer4().new TreeNode(5);
		root.left=node1;
		root.right=node3;
		root.left.right=node2;		
		FindPath(root,3);
		for(ArrayList<Integer> l:list)
		{
			for(Integer e:l)
			{
				System.out.print(e+" ");
			}
			System.out.println();
		}
		System.out.println(list.size());	
	}
	 public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {	
		if(root==null)return list;
		if(root.left==null&&root.right==null){
			if(target==root.val){
				stack.push(root.val);
				ArrayList<Integer>array=new ArrayList<Integer>();
				for(int e:stack)array.add(e);
				list.add(array);	
				stack.pop();
				}
		}else
		{
			stack.push(root.val);
			FindPath(root.left,target-root.val);
			FindPath(root.right,target-root.val);
			stack.pop();
		}		
		 return list;	        
	 }	 
}
