package jianzhi_offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jianzhi_offer.Offer3.ListNode;

//链表操作，比较复杂，不会
public class Offer56 {
public static void main(String[] anodegs) {
		ListNode node1=new Offer3().new ListNode(1);		
		ListNode node2=new Offer3().new ListNode(1);
		ListNode node3=new Offer3().new ListNode(1);
		ListNode node4=new Offer3().new ListNode(3);
		ListNode node5=new Offer3().new ListNode(5);
		ListNode node6=new Offer3().new ListNode(3);
		ListNode node7=new Offer3().new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		ListNode n=node1;		
		ListNode head=deleteDuplication(node1);
		while(head!=null)
		{
			
			System.out.print(head.val+" ");
			head=head.next;
		}
		
	}
	
public static ListNode deleteDuplication(ListNode pHead)
{
	
	List<Integer>list1=new ArrayList<>(),list2=new ArrayList<>();
	ListNode node=pHead,pre=null;
	if(node==null)return pHead;
	while(node!=null)
	{
		ListNode next=node.next;
		if(list1.contains(node.val))
		{
			if(!list2.contains(node.val))
				list2.add(node.val);
		}else
			list1.add(node.val);
		node=next;
	}
	for(int e:list2)System.out.print(e);
	System.out.println("..........................");
	node=pHead;
	while(node!=null)
	{
		ListNode next=node.next;
		if(list2.contains(node.val))
		{
			if(pre==null)
				pHead=node.next;
			else{
					pre.next=next;			
				}
			node=next;			
		}else
		{
			pre=node;
			node=next;
		}
	}
// if(pHead==null)return null; 
//    ListNode preNode = null;
//    ListNode node = pHead;
//    while(node!=null){
//        ListNode nextNode = node.next;
//        boolean needDelete = false;
//        if(nextNode!=null&&nextNode.val==node.val){
//            needDelete = true;
//        }
//        if(!needDelete){
//            preNode = node;
//            node = node.next;
//        }
//        else{
//            int value = node.val;
//            ListNode toBeDel = node;
//            while(toBeDel!=null&&toBeDel.val == value)
//            {
//                nextNode = toBeDel.next;
//                toBeDel = nextNode;
//                if(preNode==null)
//                    pHead = nextNode;
//                else
//                    preNode.next = nextNode;
//                node = nextNode;
//            }
//        }
//    }
    return pHead;
	}
}

