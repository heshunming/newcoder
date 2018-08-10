package zhaoshang;

import java.util.Scanner;



public class QueueTest {


private Entrys entrys; //当前节点
private Entrys head; //头结点

	class Entrys
	{
		public Object object;
		public Entrys next;

		public Entrys(Object object, Entrys next)
		{
			this.object = object;
			this.next = next;
		}
	}

/**
* 添加节点
* @param obj
*/
	public void add(Object obj)
	{
		Entrys entrysNew = new Entrys(obj,null);
		if(head == null){
		head = entrysNew;
		entrys = entrysNew;
		} else {
		entrys.next = entrysNew; //当前节点指向新的节点
		entrys = entrysNew; //当前节点向后移动
		}
	}
	
	/**
	* 遍历节点
	* @param entrys
	*/
	public void findQueue(Entrys entrys)
	{
		while(entrys != null)
		{
			System.out.println(entrys.object);
			entrys = entrys.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		
	}

}
