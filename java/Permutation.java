package code;

public class Permutation {
    
	public static void exchange  (char[] arr, int x, int y ){
		char temp = arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	public static void permute(char[]  s, int st_index ){
		
		 if (st_index== s.length){
			 System.out.println(new String(s).intern());
			 return;
		 }		
		
		for (int index= st_index ; index < s.length ; index++ ){
            // just before changing
			exchange(s, index, st_index);			
			permute(s, 	st_index+1);
			exchange(s, st_index, index);			
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]  s={'a', 'b', 'c'};
		permute(s, 0);

	}

}
