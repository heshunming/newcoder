package jianzhi_offer;

import java.util.LinkedList;
import java.util.Queue;

import jianzhi_offer.Offer4.TreeNode;
//序列化
public class Offer61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	String Serialize(TreeNode root) {
		if(root==null)		
			return "#,";		
		String res=root.val+",";
		res+=Serialize(root.left);
		res+=Serialize(root.right);
		return res;
	  }
	TreeNode Deserialize(String str) 
	{
		String[] values = str.split(",");
		Queue<String> queue= new LinkedList<String>();
		for(int i = 0;i != values.length; i ++)		
			queue.offer(values[i]); 		
		return preOrder(queue);
	}
	
	public TreeNode preOrder(Queue<String> queue)
	{
		String value = queue.poll();
		if(value.equals("#"))
		{
		return null;
		}
		TreeNode head = new Offer4().new TreeNode(Integer.valueOf(value));
		head.left = preOrder(queue);
		head.right = preOrder(queue);
		return head;
	}

}
