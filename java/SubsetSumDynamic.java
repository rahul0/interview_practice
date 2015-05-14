package code;

import java.util.Arrays;

public class SubsetSumDynamic {
    
	public static boolean isSum_recurse(int[] arr, int sum , int index  ){
		
		if(index >=arr.length ){
			return false;
		}
		
		return sum==arr[index] ||isSum_recurse(arr, sum-arr[index], index+1) || isSum_recurse(arr, sum, index+1);  
	}
	
	public static boolean isSum_dynamic(int[] arr, int sum , int index  ){
	
		boolean result=true;
		
		//i through j adds to sum
		boolean [][] isItPossible= new boolean[arr.length+1][arr.length+1];
		
		//
		for(int i=0; i<isItPossible.length; i++ ){
			isItPossible[i][0]=false; 
		}
		
		return result;
		
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {3, 34, 4, 12, 5, 2};
        int sum=36;
        Arrays.sort(arr);
		//boolean result=SubsetSumDynamic.isSum_recurse(arr, sum, 0);
		//System.out.println(result);
        
	}

}
