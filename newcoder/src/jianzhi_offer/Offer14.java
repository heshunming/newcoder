package jianzhi_offer;

import jianzhi_offer.Offer3.ListNode;

public class Offer14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}	
	
	
	    public static ListNode FindKthToTail(ListNode head,int k) 
	    {
			
	    			int k1=0;
	    			ListNode s1=head;
	    			while(s1!=null)
	    			{
	    				k1++;
	    				s1=s1.next;
	    			}
	                if(head==null||k>k1)
	    	    	{
	    	    		return null;
	    	    	}
	                int num=k;
	    	    	ListNode s=head,p=head,last;
	    	    	while(num>0)
	    	    	{
	    	    		num--;
	                   
	    	    		s=s.next;
	    	    	}   	    	
	    	    	while(s!=null)
	    	    	{   
	    	    		s=s.next;
	    	    		p=p.next;
	    	    		
	    	    	}
	    	    	return p;
	    }
	
}
