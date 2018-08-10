package cvte;

public class Solution {
	
	private static final String NEITHER = "Neither";
    private static final String IPV4 = "IPv4";
    private static final String IPV6 = "IPv6";
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println(validIPAddress("172:16.254.1"));
	}
    public static String validIPAddress(String IP) {
        char[] ia = IP.toCharArray();
        boolean ipv4 = false, ipv6 = false;
        int pos = 0;
        int count = 0;
        for(int i = 0; i < ia.length; i++) {
            // System.out.println("ia["+i+"]="+ia[i]);
            if (ia[i] == '.') {
                if (ipv6) return NEITHER;
                count++;
                if (count > 3) return NEITHER;
                ipv4 = true;
                if (pos == i) return NEITHER;
                int addr = Integer.parseInt(IP.substring(pos, i), 10);
                if (addr > 255) return NEITHER;
                if (!IP.substring(pos, i).equals(Integer.toString(addr))) return NEITHER;
                pos = i + 1;
            } else if (ia[i] == ':') {
                if (ipv4) return NEITHER;
                count++;
                if (count > 7) return NEITHER;
                ipv6 = true;
                if (pos == i) return NEITHER;
                pos = i + 1;
            } else if (ia[i] >= '0' && ia[i] <= '9') {
                if (i - pos + 1 > 4) return NEITHER;
            } else if ((ia[i] >= 'a' && ia[i] <= 'f') || (ia[i] >= 'A' && ia[i] <= 'F')) {
                if (ipv4) return NEITHER;
                if (i - pos + 1 > 4) return NEITHER;
                ipv6 = true;
            } else {
                return NEITHER;
            }
        }
        if (pos != ia.length) {
            if (ipv4) {
                int addr = Integer.parseInt(IP.substring(pos), 10);
                if (addr > 255) return NEITHER;
                if (!IP.substring(pos).equals(Integer.toString(addr))) return NEITHER;
            } else if (ipv6) {
                if (ia.length - pos > 4) return NEITHER;
            } else {
                return NEITHER;
            }
        }
        if (ipv4 && count == 3) return IPV4;
        if (ipv6) return IPV6;
        return NEITHER;
         
    }
}