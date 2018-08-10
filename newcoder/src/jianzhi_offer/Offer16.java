package jianzhi_offer;

import jianzhi_offer.Offer3.ListNode;

public class Offer16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode h1=new Offer3().new ListNode(1);
			
		ListNode h2=new Offer3().new ListNode(2);
			h1.next=h2;
		ListNode h3=new Offer3().new ListNode(3);
			h2.next=h3;
		ListNode h4=new Offer3().new ListNode(4);
		ListNode h5=new Offer3().new ListNode(5);
			h4.next=h5;
		ListNode h6=new Offer3().new ListNode(6);
			h5.next=h6;
			ListNode node=Merge(h1,h4);
			while(node!=null)
			{
				System.out.println(" "+node.val);
				node=node.next;
			}
	}
	 public static ListNode Merge(ListNode list1,ListNode list2) {
	        
		 ListNode node=new Offer3().new ListNode(0),head;
		 head=node;
		 while(list1!=null&&list2!=null)
		 {
			 //System.out.println(list1.val);
			 //System.out.println(list2.val);
			 while(true&&(list1!=null&&list2!=null))
			 {
				 if(list2.val>list1.val){
				 node.next=list1;
				 node=node.next;
				 list1=list1.next;}
				 else 
					 break;
			 }
			 while(true&&list1!=null&&list2!=null)
			 {
				 if((list2.val<=list1.val)){
				 node.next=list2;
				 node=node.next;
				 list2=list2.next;}else
					 break;
			 }			 
		 }
		 
		 while(list1!=null)
		 {
			 node.next=list1;
			 node=node.next;
			 list1=list1.next;
		 }
		 while(list2!=null)
		 {
			 node.next=list2;
			 node=node.next;
			 list2=list2.next;
		 }			 
		 return head.next;
	   }
}
