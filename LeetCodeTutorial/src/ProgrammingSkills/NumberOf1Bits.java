package ProgrammingSkills;

public class NumberOf1Bits {

	
	public static void main(String[] args) {
		
	}
	  public int hammingWeight(int n) {
	        int ans = 0;
	        for (int i = 0; i < 31; i++) {
	            ans = ans + (n & (1 << i)) > 0 ? 1 : 0;     
	        }
	        ans = ans + n < 0 ? 1 : 0;                     
	        return ans;
	    }
	  
	  public int hammingWeight1(int n) { // tối ưu
	        return Integer.bitCount(n);
	    }
	}

	
