package jianzhi_offer;

import jianzhi_offer.Offer4.TreeNode;

public class Offer_4 {
	     //二叉树重建，已知
	   
	//二叉树定义
	  public class TreeNode1 {
	      int val;
	     TreeNode1 left;
	     TreeNode1 right;
	      TreeNode1(int x) { val = x; 
	      }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	int[] pre={1,2,4,3,5,6};
		int[] in={4,2,1,5,3,6};
		TreeNode1 node=reConstructBinaryTree(pre,in);
		pre(node);
	}
	//static 	int index=0;
    public static TreeNode1 reConstructBinaryTree(int [] pre,int [] in)
    {
    	
    	TreeNode1 head=reConstruct(0,pre.length,in,pre,0,0);
    	
    	return head;  
    
    }
    public static TreeNode1 reConstruct(int start ,int end,int[]in,int[] pre ,int mid,int index)
    {
    	TreeNode1 node=null;

    	if(start>end||index>pre.length)
    	{
    		return null;
    		
    	}    	
    	for(int i=start;i<end;i++)
    	{
    		if(pre[index]==in[i])
    		{
    			mid=i;
    			node=new Offer_4().new TreeNode1(pre[index]);	
    			//index++;
    			node.left=reConstruct(start,mid,in,pre,mid,index+1);
    			node.right=reConstruct(mid+1,end,in,pre,mid,mid-start+index+1);//重点是确立右子树pre的index下标，根据左子树的结点数确定
    			//System.out.println("index:"+index);
    			break;    			
    		}    		
    	}
  	return node;   	
    }
    public static void pre(TreeNode1 node)
    {
    	//TreeNode no=null;
    	if(node==null)
    		return;    	
    	pre(node.left);
    	System.out.print(""+node.val+",");
    	pre(node.right);
    	//return 0;
    }
}
