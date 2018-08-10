package jianzhi_offer;

public class Offer4 {
//�������ؽ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre={1,2,4,3,5,6};
		int[] in={4,2,1,5,3,6};
		TreeNode node=reConstructBinaryTree(pre,in);
		pre(node);
	}

	 //
	  public class TreeNode {
	      int val;
	     TreeNode left;
	     TreeNode right;
	      TreeNode(int x) { val = x; 
	      }
	  }
	 
	  	static 	int index=0;
	    public static TreeNode reConstructBinaryTree(int [] pre,int [] in)
	    {
	    	
	    	TreeNode head=new Offer4().new TreeNode(pre[0]);
	    	System.out.println(pre.length);
	    	head=reConstruct(0,pre.length,in,pre,0);
	    	
	    	
	    	return head;  
	    
	    }
	    public static TreeNode reConstruct(int start ,int end,int[]in,int[] pre ,int mid)
	    {
	    	TreeNode node=null;
	    	
	    	for(int i=start;i<end;i++)
	    	{
	    		if(pre[index]==in[i])
	    		{
	    			mid=i;
	    			node=new Offer4().new TreeNode(pre[index]);	
	    			index++;
	    			break;
	    		}
	    		System.out.println("index:"+index);
	    	}
	    	if(start<mid&&index<pre.length)
	    	{	System.out.println("����������");
	    		node.left=reConstruct(start,mid,in,pre,mid);
	    		//System.out.println("����������");
	    	}else{node.left=null;}
	    	System.out.print("start:"+start);
	    	System.out.print(" mid:"+mid);
	    	System.out.print(" end:"+end);
	    	System.out.print(" size:"+pre.length);
	    	System.out.println(" index:"+index);
	    	if(mid+1<end&&index<pre.length){
	    		node.right=reConstruct(mid+1,end,in,pre,mid);
	    		System.out.println("����������");}else{node.right=(TreeNode)null;}
	    	 if(node.left!=null&&node.right==null)
	            {
	                node.right=new Offer4().new TreeNode(mid);
	            }
	    	//node.right=null;
	    		//;
	    	return node;
	    	
	    }
	    public static void pre(TreeNode node)
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
