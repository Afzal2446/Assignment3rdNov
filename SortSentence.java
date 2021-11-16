package Assignment2;

//	Input: s = "is2 sentence4 This1 a3"
//	Output: "This is a sentence"
//	Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

public class SortSentence {
	public String sortSentence(String s) {
        String str[]=s.split(" ");
        int len=str.length;
        String sort[]= new String[len];
        for(int i=0;i<len;i++){
            String k=str[i];
            int len1=k.length();
            char ch=k.charAt(len1-1);
            int n=Character.getNumericValue(ch);
            String append=k.substring(0,len1-1);
            sort[n-1]=append;
        }
        String sort1="";
        for(int j=0;j<sort.length;j++){
            sort1+=sort[j]+" ";
        }
        return sort1.substring(0,sort1.length()-1);
    }
}
