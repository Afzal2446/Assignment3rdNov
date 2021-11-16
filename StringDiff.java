package Assignment2;

//		Input: s = "abcd", t = "abcde"
//		Output: "e"
//		Explanation: 'e' is the letter that was added.

public class StringDiff {
	public char findTheDifference(String s, String t) {
	       
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
       //char - char the result is int
       result += t.charAt(i) - s.charAt(i);
        }
       //use ASCII table to get the letter
        return (char) (result + t.charAt(t.length() - 1));
   }
}
