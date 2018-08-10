package jianzhi_offer;

import java.util.Stack;

public class Offer_21 {
//真大神操作，判断出栈顺序和入栈顺序是否相符。
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean IsPopOrder(int [] pushA,int [] popA) {
		
			 if(pushA.length == 0 || popA.length == 0)
			return false;
			Stack<Integer> st = new Stack<Integer>();			
			
			
		//用于标识弹出序列的位置
		int popIndex = 0;
		for(int i = 0; i< pushA.length;i++){
			st.push(pushA[i]);

			while(!st.empty() &&st.peek() == popA[popIndex]){
				//出栈
				st.pop();
				//弹出序列向后一位
				popIndex++;
			}
		}
		return st.empty();
		//用于标识弹出序列的位置
		 //return false;
	 }
}
