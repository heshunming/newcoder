package jianzhi_offer;
import java.util.ArrayList;
public class Offer3 {

	
	 public class ListNode {
	      int val;
	      ListNode next = null;
	
      ListNode(int val) {
          this.val = val;
	     }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node4=new Offer3().new ListNode(58);
		ListNode node3=new Offer3().new ListNode(24);
		ListNode node2=new Offer3().new ListNode(0);
		ListNode node1=new Offer3().new ListNode(67);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		printListFromTailToHead(node1);
	}

	 
	
	
	
	
	    public  static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
			
	    	ArrayList<Integer> arr=new ArrayList<Integer>();
	    	ArrayList<Integer> arr2=new ArrayList<Integer>();
	    	ListNode node=listNode;
	    	if(node==null){
	    		System.out.println("[]");
	    		return arr;}
	    	while(true)
	    	{
	    		int data=node.val;
	    		arr.add(data);
	    		node=node.next;
	    		if(node.next==null)
	    		{
	    			int data_end=node.val;
	    			arr.add(data_end);
	    			break;
	    			
	    		}
	    		System.out.println(data);
	    		
	    	}
	    	int len=arr.size();
	    	System.out.println("len:"+len);
	    	for(int i=len-1;i>=0;i--)
	    	{
	    		if(i==len-1)
	    			//System.out.print("[");
	    		System.out.print(arr.get(i)+" ");
	    		if(i==0){
	    			//System.out.print("]");
	    		}
	    		arr2.add(arr.get(i));
	    	}
	    	for(int e:arr2)
	    	{
	    		System.out.print(e+" ");
	    	}
	    	return arr2;
	        
	   
	}

}
