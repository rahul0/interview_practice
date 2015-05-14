package code;

public class PatternMatching {
	
	private char  null_= '\0';
	private String pattern;
	private String text;
	
	private char[] text_array;
	private char[]  pattern_array;
	
	public PatternMatching(String pattern_, String text_) {
		pattern=pattern_;
		text= text_;
		if(pattern !=null )
		 pattern_array= pattern.toCharArray();
		
		if (text !=null)
			text_array= text_.toCharArray();
		  
	}
	
	
	public void match_pattern() {
		System.out.format("Match result of text= %s, pattern=%s, result= %s", text, pattern, isMatch(0, 0, '\0')  );
	}
	
	public boolean isMatch(int text_ptr, int pattern_ptr, char last_matched_star) {
		 
		char text_char= text_ptr!= text.length() ? text.charAt(text_ptr) : null_;
		char pattern_char= pattern_ptr!= pattern.length() ? pattern.charAt(pattern_ptr) :null_;
		
		//reached to end and both are 
		if(text_char ==null_){
			if (pattern_char == null_){
				return true;
			}else if (pattern_char == '*'){
				//handle case like *****
				return isMatch(text_ptr, pattern_ptr+1,null_);
				}else{
					return false;
				}
		}else{ // Not yet reached last character in text 
			if (pattern_char!='*' && pattern_char!='.'){
				//Normal character matching
				return text_char==pattern_char && isMatch(text_ptr+1, pattern_ptr+1,null_);
			}else if(pattern_char=='.'){
				char pattern_next_char= pattern_ptr+1!= pattern.length() ? pattern.charAt(pattern_ptr+1) :null_;
				if(pattern_next_char=='*'){
					//matching * expanded to 0                  * expanded to  one more      
					return isMatch(text_ptr+1, pattern_ptr+2, null_) || isMatch(text_ptr+1, pattern_ptr+1, text_char);
				}else{
					return isMatch(text_ptr+1, pattern_ptr+1, null_);
				}
			}else{
				//Here we are matching with *
				if(last_matched_star!= null_){
					return text_char==last_matched_star && isMatch(text_ptr+1, pattern_ptr+1, text_char) && isMatch(text_ptr+1, pattern_ptr,last_matched_star);
					
				}else{
					return isMatch(text_ptr+1, pattern_ptr+1, null_);
				}
			}
		}		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           PatternMatching pm = new PatternMatching("a" ,"aa" );
           pm.match_pattern();
	}

}
