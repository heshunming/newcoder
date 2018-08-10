package leetcode;

public class WildCardMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab_ cd";
		String p="******";
		System.out.println(isMatch2(s,p));
	}
	
	    public boolean isMatch(String s, String p) {
	        int idxs = 0, idxp = 0, idxstar = -1, idxmatch = 0;
	        while(idxs < s.length()){
	            // ������ָ��ָ����ȫ��ͬ���ַ�ʱ������p����������?ʱ
	            if(idxp < p.length() && (s.charAt(idxs) == p.charAt(idxp) || p.charAt(idxp) == '?')){
	                idxp++;
	                idxs++;
	            // ����ַ���ͬҲû��?������p��������*ʱ�����Ǽ�¼��*��λ�ã������ı�s��ָ��
	            } else if(idxp < p.length() && p.charAt(idxp)=='*'){
	                idxstar = idxp;
	                idxp++;
	                //����*��������idxmatch����¼*ƥ�䵽��s�ַ�����λ�ã��Ͳ���*ƥ�䵽��s�ַ���λ��������
	                idxmatch = idxs;
	            // ����ַ���ͬҲû��?��pָ���Ҳ����*����֮ǰ�Ѿ�����*�Ļ������ǿ��Դ�idxmatch����ƥ�������ַ�
	            } else if(idxstar != -1){
	                // ����һ��*��ƥ�䣬������p��ָ��ҲӦ���˻�����һ��*�ĺ���
	                idxp = idxstar + 1;
	                // ��*ƥ�䵽��λ�õ���
	                idxmatch++;
	                // s��ָ���˻�����*ƥ�䵽λ��
	                idxs = idxmatch;
	            } else {
	                return false;
	            }
	        }
	        // ��Ϊ1��*��ƥ���������У����pĩβ�ж��*�����Ƕ�Ҫ����
	        while(idxp < p.length() && p.charAt(idxp) == '*'){
	            idxp++;
	        }
	        // ���pƥ�����ˣ�˵��ƥ��ɹ�
	       // p.matches(s);
	        return idxp == p.length();
	      
	    }
	    
	    public static boolean isMatch2(String s, String p) 
	    {
	    	
	    		if (s == null && p == null)
	    			return true;
	    		if (s == null && p != null || s != null && p == null)
	    			return false;
	    		if (s.equals(p))
	    			return true;
	    		if (p.contains("*"))
	    		p = p.replaceAll("\\*", "[0-9a-zA-Z]*");
	    		if (p.contains("?"))
	    		p = p.replaceAll("\\?", "[0-9a-zA-Z]?");
	    		return s.matches(p);
	       
	    	
	    }
	

}
