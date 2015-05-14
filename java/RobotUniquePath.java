package code;

import java.util.ArrayList;

class Position{
	int x;
	int y;
	public Position(int x_, int y_) {
		// TODO Auto-generated constructor stub
		x=x_;
		y=y_;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+","+y+")";
	}
}
public class RobotUniquePath {
    
	private String[][] board ;
	private int row=0;
	private int col=0;
	private int count=0;
	
	
	public RobotUniquePath(int row_, int col_ ) {
		// TODO Auto-generated constructor stub
		this.row=row_;
		this.col=col_;
		this.board = new String [this.row][this.col];
		
	}
	
	private boolean  is_safePosition(int pos_x, int pos_y){
		
		boolean isPositionSafe=false;
		//if position is on board
		if(pos_x<row&& pos_y <col){
			return true;
		}		
		return  isPositionSafe;
	}
	
	
	
	private void traverse_robot(int pos_x, int pos_y,ArrayList<Position> states ){
		
	 if(pos_x==row-1 && pos_y==col-1){
			  //increase count
		     states.add(new Position(pos_x, pos_y));
		     System.out.println(states.toString());
		     states.remove(states.size()-1);
			 count++;
			 return ;
	}
	 
	  if(!is_safePosition(pos_x, pos_y)){
		  //throw away the last element		  
		  return;
	  }
	  
	  //go left 
	  Position new_pos=new Position(pos_x, pos_y);
	  System.out.println("Adding :" + new_pos);
	  states.add(new_pos);
	  traverse_robot(pos_x+1, pos_y,states);
	  //go down 
	  traverse_robot(pos_x, pos_y+1,states);
	  states.remove(states.size()-1); 
	  
	}
	
	
	public int get_possible_path_count(){	
		ArrayList<Position> results=  new ArrayList<Position>();
		traverse_robot(0, 0, results); 
		return  count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         RobotUniquePath  rup = new RobotUniquePath(3, 3);
         int count=rup.get_possible_path_count();
         System.out.println(count);
         
	}

}
