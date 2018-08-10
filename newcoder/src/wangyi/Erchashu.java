package wangyi;

 public class Erchashu {
	 class TreeNode
	{
		int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) 
	    {
	        this.val = val;
	      
	    }
	}
	
	//二叉树
     class Tree 
     {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		StringBuffer max_str=null,min_str=null;
		void preOrder(TreeNode root,char code,StringBuffer code_str)
		{
			if(root!=null)
			{
			code_str.append(code);
			if(root.left==null&&root.right==null)
			{
				if(root.val>max)
				{
					max=root.val;
					max_str=code_str;
				}
				if(root.val<min)
				{
					min=root.val;
					min_str=code_str;
				}
			}
			preOrder(root.left,'0',new StringBuffer(code_str));
			preOrder(root.right,'1',new StringBuffer(code_str));
			}
		}
		public int getDis(TreeNode root) 
		{	    	
			preOrder(root,'s',new StringBuffer());
			int i;
			for(i=0;i<(max_str.length()>min_str.length()?max_str.length():min_str.length());i++)
			{
				if(max_str.charAt(i)!=min_str.charAt(i))
				{
					break;
				}
				
			}
			return max_str.substring(i).length()+min_str.substring(i).length();
	    }
	
     }
     public static void main(String[] args)
 	{
 		System.out.println("");
 	}
	
}
