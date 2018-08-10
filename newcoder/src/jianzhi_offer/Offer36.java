package jianzhi_offer;

import java.util.ArrayList;
import java.util.HashSet;

import jianzhi_offer.Offer3.ListNode;

public class Offer36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ListNode root1=new Offer3().new ListNode(0);
      ListNode h1=new Offer3().new ListNode(1);
      ListNode p1=new Offer3().new ListNode(2);
      ListNode h2=new Offer3().new ListNode(3);
      ListNode p2=new Offer3().new ListNode(4);
      ListNode h3=new Offer3().new ListNode(5);
      root1.next=h1;
      h1.next=h2;
      h2.next=h3;
      p1.next=p2;
      p2.next=h1;
      System.out.println(FindFirstCommonNode(root1,p1).val);
      
	}
	 public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		
		 ArrayList<ListNode> hs=new ArrayList<>();
		 ListNode temp=pHead1,temp2=pHead2;
		 while(temp!=null)
		 {
			 hs.add(temp);
			 temp=temp.next;
		 }
		 while(temp2!=null)
		 {
			 if(hs.contains(temp2))	 
				 break;			
			 temp2=temp2.next;			 
		 }
		 return temp2;		 
	 }

}
