package code;

import java.util.HashMap;

public class SpiralPrinting {
    HashMap<String ,String> s = new HashMap<>();
    public static void sp_printing(int[][] arr, int x, int y , int row_length,int col_length) {
    	int x_=x;
    	int y_=y;
    	
    	//-> motion
    	System.out.println("right");
    	for( ;y_ < y+row_length; y_++  ){
    		System.out.format("%5d ", arr[x_][y_]);
    	}
    	
    	y_--;
    	x_++;
    	//print downwards
    	// downward motion
    	System.out.println("down");
    	for( ;x_ < x+col_length; x_++  ){
    		System.out.format("%5d ", arr[x_][y_]);
    	}
    	
    	x_--;
    	y_--;
    	
    	 // <- motion
    	System.out.println("left");
    	for( ;y_ > y-row_length-1; y_--  ){
    		System.out.format("%5d ", arr[x_][y_]);
    	}
    	
    	y_++;
    	x_--;
    	
    	//upward motion
    	System.out.println("upward");
    	for( ;x_ > x; x_--  ){    		
    		System.out.format("%5d ", arr[x_][y_]);
    		
    	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [][] arr= {{1,    2,   3,   4},
        	        {5,    6,   7,   8},
        	        {9,   10,  11,  12}
        	        };
          
          int col_length= arr.length;
          int row_length=arr[0].length;
          int x=0;
          int y=0;
          while(row_length >0){
        	  sp_printing(arr, x, y, row_length, col_length);
        	  row_length-=2;
        	  col_length-=2;
        	  x++;
        	  y++;
          }
          
	}

}
