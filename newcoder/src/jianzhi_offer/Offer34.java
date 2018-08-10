package jianzhi_offer;

import java.util.ArrayList;

public class Offer34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="gggggg";
		System.out.println(s.length());
		System.out.println(FirstNotRepeatingChar(s));
		//System.out.println("12312");
	}
	public static int FirstNotRepeatingChar(String str) {		
		ArrayList<Character>list=new ArrayList<>();
		ArrayList<Character>list2=new ArrayList<>();
		if(str.length()==0)return -1;
		list.add(str.charAt(0));
		for(int i=1;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			if(list.contains(Character.valueOf(str.charAt(i)))){
				if(!list2.contains(Character.valueOf(str.charAt(i))))
					list2.add(Character.valueOf(str.charAt(i)));}
			else
				list.add(str.charAt(i));			
		}
		for(char c:list2){list.remove(Character.valueOf(c));
			System.out.print(c+" ");
		}
		if(list.size()==0)return -1;
        return str.indexOf(list.get(0));
    }

}
