package test.pingduoduo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Bestfriends {
	public static void main(String[] args) {		
		 Scanner scan=new Scanner(System.in);
		 String s=scan.nextLine();
		 String[] strs=s.split(" ");
		 int N=Integer.valueOf(strs[0]),target=Integer.valueOf(strs[1]);
		 HashMap<Integer,List<Integer>>map=new HashMap<>();
		 List<Integer>list;
		 int k=N;
		for(int i=0;i<N;i++){
			list=new ArrayList<Integer>();
			s=scan.nextLine();
			strs=s.split(" ");
			for(String e:strs)
			{
				list.add(Integer.valueOf(e));
			}
			map.put(i, list);
		}
		int max=-1,count=-1,index=-1;
		for(int i=0;i<N;i++){
			if(i!=target&&(!map.get(i).contains(target))){
				list=map.get(i);
				for(int e:list)
				{
					if(map.get(target).contains(e))
					count++;
				}
				if(count>max){
					max=count;
					index=i;
				}
				if(count>=0)
					 count=-1;
			}
		}
		System.out.println(index);
	}
}
