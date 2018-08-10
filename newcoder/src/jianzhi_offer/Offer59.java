package jianzhi_offer;

import java.util.ArrayDeque;
import java.util.ArrayList;

import jianzhi_offer.Offer4.TreeNode;

public class Offer59 {
//之字形打印
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				TreeNode root=new Offer4().new TreeNode(0);
				TreeNode node1=new Offer4().new TreeNode(1);
				TreeNode node2=new Offer4().new TreeNode(2);
				TreeNode node3=new Offer4().new TreeNode(3);
				TreeNode node4=new Offer4().new TreeNode(2);
				TreeNode node5=new Offer4().new TreeNode(3);
				root.left=node1;
				root.right=node2;
				node1.left=node3;
				node1.right=node4;
				node2.left=node5;
				//root.left.right=node3;
				//root.right.left=node5;
				ArrayList<ArrayList<Integer>>list=Print(root);
				System.out.println(list.size());
				for(ArrayList<Integer>array:list)
				{
				
					for(int i:array)
					{
						System.out.print(" "+i);
					}
					System.out.println();
				}
	}
	
	public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {		
		int depth=0, size=0;
		depth=TreeDepth(pRoot);
		ArrayList<ArrayList<Integer>>list=new ArrayList<>();
		ArrayDeque<TreeNode>queue=new ArrayDeque<TreeNode>();
		ArrayList<Integer>array=new ArrayList<>();
		if(pRoot==null)
		{
			return list;
		}
		queue.addLast(pRoot);
		//array.add(pRoot.val);
		//list.add(array);
		boolean flag=true;
		for(int i=0;i<depth;i++)
		{			
			size=queue.size();
			System.out.println("queue of size:"+size);
			//TreeNode node=null;
			array=new ArrayList<Integer>();
			while(size-->0)
			{			
				System.out.println("当前节点的value："+queue.getFirst().val);
				if(flag)
				{
					if(queue.getFirst().left!=null)			
					{
						queue.addLast(queue.getFirst().left);
						System.out.println("左子树");
						//System.out.println("right value:"+queue.getLast().val);
					}
					if(queue.getFirst().right!=null)
					{
						queue.addLast(queue.getFirst().right);
						System.out.println("右子树");
						//System.out.println("right value:"+queue.getLast().val);
					}
					array.add(queue.removeFirst().val);
				/*	if(array.size()>0)
						System.out.println("value:"+array.get(array.size()-1));*/
				}else
				{
					if(queue.getLast().right!=null)			
					{
						queue.addFirst(queue.getLast().right);
						System.out.println("左子树");
						//System.out.println("right value:"+queue.getLast().val);
					}
					if(queue.getLast().left!=null)
					{
						queue.addFirst(queue.getLast().left);
						System.out.println("右子树");
						//System.out.println("right value:"+queue.getLast().val);
					}
					array.add(queue.removeLast().val);
					/*if(array.size()>0)
						//System.out.println("value:"+array.get(array.size()-1));*/
				}
			}
//			if(!flag)
//			{
//				ArrayList<Integer>temp=new ArrayList<>();
//				for(int i1=array.size()-1;i1>=0;i1--)
//				{
//					temp.add(array.get(i1));
//				}
//				array=temp;
//			}
			flag=!flag;
			list.add(array);			
		}
		return list;
	}
	 public static int TreeDepth(TreeNode root) 
	 {
	      if(root==null)		 
				 return 0;	 			 
	      return TreeDepth(root.left)+1>TreeDepth(root.right)+1?TreeDepth(root.left)+1:TreeDepth(root.right)+1;	          
	 }

}
