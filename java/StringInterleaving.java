package code;

public class StringInterleaving {
  

	
	 public static boolean isInterleave(String s1, String s2, String s3) {
	        
	        if (s1==null || s2==null| s3==null){
	            return false;
	        }
	        if (s1.length()+s2.length() != s3.length()){
	            return false;
	        }
	        
	        if(s1.length()==0){
	            return s2==s3;
	        }
	        
	        if(s2.length()==0){
	            return s1==s3;
	        }
	        
	        return  i_(s1, s2, s3, 0, 0,0);
	        
	    }
	    
	    public static boolean i_(String s1, String s2, String s3, int s1_idx, int s2_idx, int s3_idx) {
	        
	        if(s3_idx>=s3.length()){
	            return true;
	        }
	        
	        if(s1_idx >=s1.length()){

	            return s3.substring(s3_idx).equals(s2.substring(s2_idx));
	        }
	        
	        if(s2_idx>=s2.length()){
	            return s3.substring(s3_idx).equals(s1.substring(s1_idx));
	        }
	        
	        return  s2_idx<s2.length()&&s3.charAt(s3_idx)==s2.charAt(s2_idx) ||s1_idx<s1.length()&&s3.charAt(s3_idx)==s1.charAt(s1_idx) ? i_(s1,s2,s3,s1_idx+1,s2_idx,s3_idx+1)|| i_(s1,s2,s3,s1_idx,s2_idx+1,s3_idx+1) : false;
	    }
	
	  
	    public static boolean interleaving(String s1, String s2, String s3) {
			
	    	if (s1==null || s2==null|| s3==null){
	    		return false;
	    	}
	    	
	    	boolean[][] table= new boolean[s1.length()+1][s2.length()+1];
	    	table[0][0]=true; // empty string 
	    	for(int i=1;i<=s1.length();i++){
	    		
	    		for(int j=0; j<= s2.length();j++){
	    			
	    			if(i==0&&j==0){
	    				continue;
	    			}
	    			if(i==0){	    				
	    				table[i][j]=s3.charAt(j-1)==s2.charAt(j-1) && table[i][j-1];
	    			}else if(j==0){
	    				table[i][j]=s3.charAt(i-1)==s1.charAt(i-1) && table[i-1][j];
	    			}else{
	    				char c3= s3.charAt(i+j-1);
	    				char c1= s1.charAt(i-1);
	    				char c2= s1.charAt(j-1);
	    				
	    				if (c1==c3&&c2!=c3){
	    					table[i][j]=table[i-1][j];
	    				}else if (c1!=c3&&c2==c3){
	    					table[i][j]=table[i][j-1];
	    				}else{
	    					table[i][j]=table[i][j-1] ||table[i-1][j];
	    				}
	    			}
	    			
	    		}
	    	}
	    	
	    	return table[s1.length()][s2.length()];
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        String s1="abbbbbbcabbacaacccababaabcccabcacbcaabbbacccaaaaaababbbacbb";
        String s2="ccaacabbacaccacababbbbabbcacccacccccaabaababacbbacabbbbabc";
        String s3="cacbabbacbbbabcbaacbbaccacaacaacccabababbbababcccbabcabbaccabcccacccaabbcbcaccccaaaaabaaaaababbbbacbbabacbbacabbbbabc";
        */
		
		String s1="XXY";
		String s2="XXZ";
		String s3="XXZXXXY";
	   System.out.println(isInterleave("XY" ,"WZ" ,"WZXY"));
	   System.out.println(isInterleave("XY", "X", "XXY"));
	   System.out.println(isInterleave("YX", "X", "XXY"));
	   System.out.println(isInterleave("XXY", "XXZ", "XXXXZY"));
	   System.out.println(interleaving("XXY", "XXZ", "XXXXZY"));
	   
	   
	 

	}

}


