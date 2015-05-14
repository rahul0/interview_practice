package code;

public class EditDistance {
    
	private String from;
	private String to;
	int[][] distance;
	public EditDistance(String from_, String to_) {
		// TODO Auto-generated constructor stub
		from=from_;
		to=to_;
	}
	
	public void print_distabce_matrix(){
		for (int i = 0; i < from.length()+1; i++) {
			for(int j=0 ; j< to.length()+1; j++){
				System.out.format(" %4d " , distance[i][j]);
			}
			System.out.println();
		}
		
	}
	public  void doEditDistance(){
		//converting str1:|str1|=k -> str2:|str2|=0 is k i.e we will have to delete k chars 
		distance=  new int[from.length()+1][to.length()+1];
		
		//delete all characters
		for(int i=0; i< from.length()+1;i++){
			distance[i][0]=i;
		}
		
		//convert an empty string with a string of length   
		for(int i=0; i< to.length()+1;i++){
			distance[0][i]=i;
		}
		
		for (int i = 1; i < from.length()+1; i++) {
			for(int j=1; j< to.length()+1;j++){
					distance[i][j]= Math.min(Math.min(distance[i-1][j]+1, distance[i][j-1]+1),from.charAt(i-1)!=  to.charAt(j-1)? distance[i-1][j-1]+2 : distance[i-1][j-1] );
			}			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EditDistance ed= new EditDistance("INTENTION", "EXECUTION");
        ed.doEditDistance();
        ed.print_distabce_matrix();
	}

}
