package ProgrammingSkills;

public class SubtractProductAndSum {

	
	public int subtractProductAndSum(int n) {
		int pro = 1;
		int sum = 0;
		int diff = 0;
		while(n>0){
		int rem = n%10;
		System.out.println("rem " +rem);
		pro = pro*rem;
		sum = sum+rem;
		n /= 10;

		    }
		    diff = pro - sum;
		    
		 return diff;

	}
	
	
	
//	public int subtractProductAndSum(int n) {
//		int pro = 1;
//		int sum = 0;
//		int diff = 0;
//		while(n>0){
//		int rem = n%10;
//		System.out.println("rem " +rem);
//		pro = pro*rem;
//		sum = sum+rem;
//		n /= 10;
//
//		    }
//		    diff = pro - sum;
//		    
//		 return diff;
//
//	}
	
	
//	public  int subtractProductAndSum(int n) {
//	if(n==0) return 0;
//	String st = n + "";
//	int sum =0;
//	int multi = 1;
//	int ans = 0;
//	String [] arrSt = new String[st.length()];
//	for (int i =0 ;i <st.length() ; i++) {
//		arrSt[i] = st.substring(i,i+1);
//		sum += Integer.parseInt(arrSt[i]);
//		multi *= Integer.parseInt(arrSt[i]);
//	} 
//	
//	return multi - sum;
//}
}
