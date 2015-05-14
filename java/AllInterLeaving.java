package code;

import java.util.ArrayList;

public class AllInterLeaving {

	public static void  all(String s1, String s2, int s_1, int s_2, StringBuilder sb) {
		
		if(s_1>=s1.length() && s2.length()>=s_2){
			sb.append("");
			System.out.println(sb.toString());
			sb.setLength(0);
			return;
		}
		
		if(s_1>=s1.length()){
			sb.append(""+s2.substring(s_2));
			//sb.delete(0, sb.length()-1);
			
		}else if(s_2>=s2.length()){
			sb.append(s1.substring(s_1));
			System.out.println(sb.toString());
			//sb.delete(0, sb.length()-1);
			
		}else{
			
			
			all(s1,s2, s_1+1, s_2, sb);
			
			all(s1,s2, s_1, s_2+1, sb);
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             all("AB", "CD", 0, 0, new StringBuilder());
	}

}
