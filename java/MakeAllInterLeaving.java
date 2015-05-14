package code;


public class MakeAllInterLeaving {
   
	public static void il(String pre, String  s1, String s2) {
		
		if(s1.length()==0 || s2.length()==0){
			System.out.println(pre+ s1+s2);
			return;
		}		
			il(pre+s1.charAt(0), s1.substring(1), s2);			
			il(pre+s2.charAt(0), s1, s2.substring(1));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=20;
		System.out.println(Integer.toString(i, 2));
		il("", "a", "cd");

	}

}
