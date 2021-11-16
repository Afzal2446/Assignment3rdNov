package Assignment2;

//		Input: s = "anagram", t = "nagaram"
//		Output: true

public class StringAnagram {
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;    
        }
        
        int[] charCount = new int[128];
        
        // First string
        for(char c : s.toCharArray()) {
            charCount[c]++;
        }
        
        // Second string
        for(char c : t.toCharArray()) {
            charCount[c]--;
        }
        
        // Check for all counts
        for(int count : charCount) {
            if(count > 0) return false;
        }
        
        return true;
    }
}
