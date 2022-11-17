package Algorithm;

public class FirstBadVersion {
	
	   public int firstBadVersion(int n) {
		   int start =0 , end =0 , firstBadVersion = 0 ,  mid =0;
		   while(start <= end) {
			   mid = (start + end)/2;
			   if(isBadVersion(mid)) {
				   end = mid -1;
			   }else {
				   start = mid +1; 
			   }
		   }
		   
	        return firstBadVersion;
	    }
	   
	   public static boolean isBadVersion(int version) {
		   
		   
		   // hàm check version đó tệ hay ko
		   return true;
	   }
}
