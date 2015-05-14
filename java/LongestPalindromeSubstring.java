package code;

public class LongestPalindromeSubstring {

	public static String lps(String input) {
		String  result="";
		if (input.length() ==1){
			return input;
			
		}
		StringBuffer sb = new StringBuffer();
		for (char c : input.toCharArray() ){
			sb.append(Character.toString(c)+"#" );
		}
		int[] length_=new int[sb.length()];
		
		for()
		
		
		
		
		System.out.println("After  conversion: "+  sb.toString());
		
		int left_ptr=0;
	    int right_ptr=0;
	    int length=0;
 
	    
	    for (int i=1; i< sb.length()-1; i++ ){
	    	
	    	if (sb.charAt(0)!='#'){
	    		length=1;
	    	}
	    }
		
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
