package jianzhi_offer;

import java.util.Stack;

public class Offer_21 {
//�����������жϳ�ջ˳�����ջ˳���Ƿ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean IsPopOrder(int [] pushA,int [] popA) {
		
			 if(pushA.length == 0 || popA.length == 0)
			return false;
			Stack<Integer> st = new Stack<Integer>();			
			
			
		//���ڱ�ʶ�������е�λ��
		int popIndex = 0;
		for(int i = 0; i< pushA.length;i++){
			st.push(pushA[i]);

			while(!st.empty() &&st.peek() == popA[popIndex]){
				//��ջ
				st.pop();
				//�����������һλ
				popIndex++;
			}
		}
		return st.empty();
		//���ڱ�ʶ�������е�λ��
		 //return false;
	 }
}
