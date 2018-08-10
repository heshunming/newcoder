package cvte;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public  int numDecodings(String s) {
         
	        if(s.length()==0)return 0;
	        HashMap<String,Integer>hs=new HashMap<>();
	        hs.put("",1);
	        return Decodings(s,hs);
	    }
	    public  int Decodings(String s,HashMap<String,Integer>hs) {
	        
	        if(hs.containsKey(s))return hs.get(s);
	        if(s.charAt(0)=='0')return 0;
	        if(s.length()==1)return 1;
	        int w=Decodings(s.substring(1),hs);
	        int num=Integer.valueOf(s.substring(0, 2));
	        if(num<=26)
	        {
	            w+=Decodings(s.substring(2), hs);
	        }
	        hs.put(s,w);
	        return w;
	    }
	    public String validIpAddress(String Ip)
	    {
	    	String []str=Ip.split(":");
	    	if(str.length!=4)return "Neither";
	    	boolean isIpv4=true;
	    	for(String s:str)
	    	{
	    		if(s.length()==0)return "Neither";
	    		if(s.matches(""));
	    	}
	    	return null;
	    }

}
