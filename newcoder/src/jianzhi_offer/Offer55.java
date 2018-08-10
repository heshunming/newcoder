package jianzhi_offer;
//寻找环的入口
import jianzhi_offer.Offer3.ListNode;

public class Offer55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode EntryNodeOfLoop(ListNode pHead)
	 {
			
		 ListNode slow=pHead,fast=pHead;
		 while(fast!=null&&fast.next!=null)
		 {
			 slow=slow.next;
			 fast=fast.next.next;
			 if(slow==fast)break;
		 }
		 if(fast==null||fast.next==null)
		 {
			 return null;
		 }
		 slow=pHead;//慢结点回到开始的位置
		 while(slow!=fast)
		 {
			 slow=slow.next;//慢的和快的同时一步一步的走
			 fast=fast.next;
		 }
		return slow;   
	 }

}
