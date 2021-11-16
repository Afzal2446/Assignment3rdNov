package Assignment2;

//		Input: nums = [1,2,3,1]
//		Output: true

import java.util.*;
public class ContainsDuplicate {
	 public boolean containsDuplicate(int[] nums) {
	        
	        int length=nums.length;
	        Set<Integer> set= new HashSet<Integer>();
	        for(int element:nums){
	            set.add(element);
	        }
	        int size=set.size();
	        if(size!=length){
	            return true;
	        }
	        else
	            return false;
	        
	    }
}
