package jianzhi_offer;

import java.util.Stack;

public class Offer44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseSentence("da  fa  "));
	}
	 public static  String ReverseSentence(String str) {
		 if(str.matches("\\s+"))return str;
		Stack<String>stack=new Stack<>();
		String strs[]=str.split("\\s+");
		for(String s:strs)
			stack.push(s);
		str="";
		while(!stack.isEmpty())
			str+=stack.pop()+" ";
		return str.trim();	        
	  }

}
