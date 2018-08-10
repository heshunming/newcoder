package jianzhi_offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class Offer32 {
	public static void main(String[] args) {		
		int[]a={12,123,12,432,543};
		System.out.println(PrintMinNumber(a));		
	}
	public static String PrintMinNumber(int [] numbers) {		
		String min="a";
		List<String>list=new ArrayList<>();
		for(int e:numbers)list.add(String.valueOf(e));
		HashSet<String>hs=new HashSet<String>();
		per(list,hs,0,list.size());
		list.clear();
		for(String e:hs){list.add(e);}
		Collections.sort(list);
		return list.get(0);
    }
	public static void per(List<String>list,HashSet<String>hs,int k,int length)
	{				
		if(k==length){
			String s="";
			for(String e:list)s+=e;
			hs.add(s);
			return;
		}
			for(int i=k;i<length;i++){
				swap(list,i,k);
				per(list,hs,k+1,length);
				swap(list, i, k);
			}		
	}
	public static void swap(List<String>list,int i,int j)
	{
		String s=list.get(i);
		list.set(i, list.get(j));
		list.set(j, s);
	}

}
