package jianzhi_offer;

import java.util.ArrayDeque;
import java.util.ArrayList;

import jianzhi_offer.Offer4.TreeNode;

public class Offer60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) 
	{
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
		boolean flag=true;
		for(int i=0;i<depth;i++)
		{			
			size=queue.size();		
			array=new ArrayList<Integer>();
			while(size-->0)
			{			
				
				if(flag)
				{
					if(queue.getFirst().left!=null)			
					{
						queue.addLast(queue.getFirst().left);									
					}
					if(queue.getFirst().right!=null)
					{
						queue.addLast(queue.getFirst().right);						
					}
					array.add(queue.removeFirst().val);				
				}else
				{
					if(queue.getFirst().left!=null)			
					{
						queue.addLast(queue.getFirst().left);					
					}
					if(queue.getFirst().right!=null)
					{
						queue.addLast(queue.getFirst().right);					
					}
					array.add(queue.removeFirst().val);					
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
