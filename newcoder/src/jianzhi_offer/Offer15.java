package jianzhi_offer;

import jianzhi_offer.Offer3.ListNode;

public class Offer15 {
//����ת�������Ա���8.1.1���н���
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode ReverseList(ListNode head)
	 {		
		 ListNode p=head;
		 ListNode pre=null;
		 while(p!=null)
		 {
			 ListNode ne=p.next;			
			 p.next=pre;
			 pre=p;
			 p=ne;			 	
		 }
		 return pre;	        
	 }

}
