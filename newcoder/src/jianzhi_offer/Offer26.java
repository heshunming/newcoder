package jianzhi_offer;

import java.util.ArrayDeque;
import java.util.Queue;
import jianzhi_offer.Offer4.TreeNode;

public class Offer26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new Offer4().new TreeNode(0);
		TreeNode node1=new Offer4().new TreeNode(1);
		TreeNode node2=new Offer4().new TreeNode(2);
		TreeNode node3=new Offer4().new TreeNode(3);
		node2.left=node1;
		node2.right=node3;
		node2.left.left=root;
		TreeNode r=Convert(node2);			
	}
	 public static TreeNode Convert(TreeNode pRootOfTree) {		
		 if(pRootOfTree==null)		 
			 return pRootOfTree;		
		 //ArrayDeque<TreeNode>queue=new ArrayDeque<TreeNode>();
		 Queue<TreeNode>queue=new ArrayDeque<>();
		 adjust(pRootOfTree,queue);
		 int len=0;
		 pRootOfTree=((ArrayDeque<TreeNode>) queue).peekFirst();		
		 TreeNode cur=null,pre=null;
		 System.out.println();		
		 while(!queue.isEmpty())
		 {
			 pre=cur;
			 cur=queue.poll();
			 cur.left=pre;
			 if(queue.size()!=0&&((ArrayDeque<TreeNode>) queue).peekFirst()!=null)
			 {				 
				 cur.right=((ArrayDeque<TreeNode>) queue).peekFirst();
			 }
			 System.out.print(cur.val+" ");			 
		 }
		 return pRootOfTree;	        
	   }	
	 public static  void adjust(TreeNode root,Queue<TreeNode>queue)
	 {
		 if(root==null)
			 return;
		 adjust(root.left,queue);
		 System.out.print(root.val+" ");
		 ((ArrayDeque<TreeNode>) queue).addLast(root);
		 adjust(root.right,queue);		
	 }

}
