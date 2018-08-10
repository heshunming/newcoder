package jianzhi_offer;

import java.math.BigInteger;

public class Offer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int JumpFloor(int target) {
		

		if (target <= 0) {
			return -1;
		} else if (target == 1) {
			return 1;
		} else if (target ==2) {
			return 2;
		} else {
			return JumpFloor(target-1)+JumpFloor(target-2);
		}
		//return 0;
	 }
}
