package zhaoshang;

import java.util.Scanner;



public class QueueTest {


private Entrys entrys; //��ǰ�ڵ�
private Entrys head; //ͷ���

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
* ��ӽڵ�
* @param obj
*/
	public void add(Object obj)
	{
		Entrys entrysNew = new Entrys(obj,null);
		if(head == null){
		head = entrysNew;
		entrys = entrysNew;
		} else {
		entrys.next = entrysNew; //��ǰ�ڵ�ָ���µĽڵ�
		entrys = entrysNew; //��ǰ�ڵ�����ƶ�
		}
	}
	
	/**
	* �����ڵ�
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
