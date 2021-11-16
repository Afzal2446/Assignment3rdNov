package Assignment2;

		//Input: nums = [2,2,1,1,1,2,2]
		//Output: 2

public class MajorityElement {
	
	 public int majorityElement(int[] nums) {
	        int count = 0;
	        int candidate = 0;
	        
	        for(int i : nums){
	            if(count == 0){
	                candidate = i;
	            }
	            if(i == candidate) 
	                count += 1;
	            else
	                count -= 1;
	        }
	        
	        return candidate;
	    }
}
