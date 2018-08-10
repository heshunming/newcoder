package jianzhi_offer;

public class Offer57 {

	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	   }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	}
	 public TreeLinkNode GetNext(TreeLinkNode pNode)
	    {
	        if(pNode==null)
			{
				return null;
			}
		
			if(pNode.right!=null)//右子树存在，则下一个结点肯定在右子树中最靠左的一个结点
			{
	             pNode=pNode.right;
	             while(pNode.left!=null)
	            	 pNode=pNode.left;
	             return pNode;
			}
			while(pNode.next!=null)//右子树不存在，则下一个结点只能在双亲结点中查找。
			{
				TreeLinkNode parent=pNode.next;
				if(parent.left==pNode)
					return pNode.next;
				pNode=pNode.next;
			}
			return null; 
	    }

}
