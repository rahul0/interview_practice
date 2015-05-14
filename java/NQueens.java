package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class NQueens {
    
	private int[] board= new int[8] ;
	
	static final int UNINITALIZED =-1; 

	public NQueens() {
		// TODO Auto-generated constructor stub
		Arrays.fill(board, -1);
	}
	
	private boolean isPositionSafe(int row_id, int col_id){		
		boolean issafe=false;
        if (row_id==0){
        	return true;
        }				
        
        //for rest of the row check if the position is safe
        //Code
		return issafe;
		
	}
	
	private void solve_board(int row0_position){
		
		
	}
	
	/**
	 * Resets the board while star exploring a new solution.
	 * @return
	 */
	private void reset_board() {
		for (int i = 0; i < board.length; i++) {
			board[i]=-1;
		}
	}
	/*
	 * Prints the board.  
	 */
	public void print_board(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
