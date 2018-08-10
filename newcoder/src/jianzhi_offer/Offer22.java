package jianzhi_offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

import jianzhi_offer.Offer4.TreeNode;

public class Offer22 {
//层序遍历
	public static void main(String[] args) {		
		TreeNode root=null;
		PrintFromTopToBottom(root);
	}
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		if(root==null)return arr;
		Queue<TreeNode>queue=new ArrayDeque<>();
		queue.add(root);
		TreeNode cur;
		while(!queue.isEmpty())
		{
			cur=queue.peek();
			arr.add(cur.val);
			if(cur.left!=null)queue.add(cur.left);
			if(cur.right!=null)queue.add(cur.right);
			queue.poll();
			
		}
		return arr;
    }

}
