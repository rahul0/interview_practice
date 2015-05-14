package code;

import java.util.Arrays;
import java.util.Random;
public class Median_Problems {
   	
	public static void findMedianByMerge(int[] arr1, int[] arr2){
		int max_length= arr1.length+ arr2.length;
		int[] merged_array= new int[max_length];
		int arr1_ptr=0;
		int arr2_ptr=0;		
		int cnt=0;
						
		while(arr1_ptr  < arr1.length && arr2_ptr < arr2.length ){
			if(arr1[arr1_ptr] < arr2[arr2_ptr]){
				merged_array[cnt++]= arr1[arr1_ptr++];
			}else{
				merged_array[cnt++]= arr2[arr2_ptr++];		 
			}				
		}
		
		if(arr1_ptr < arr1.length){
			while(arr1_ptr < arr1.length){
			 merged_array[cnt++]= arr1[arr1_ptr++];
			}
		}else{
			while(arr2_ptr < arr2.length){
				merged_array[cnt++]= arr2[arr2_ptr++];
				}
		}
		
		
		System.out.println("Median: " +merged_array[max_length/2]);
		System.out.println("Merged Array: " + Arrays.toString(merged_array));
	}
	
	public static void main(String[] args) {
	Random rand= new Random();
	 int[] arr1= new int[5];
	 for (int i = 0; i < arr1.length; i++) {
		arr1[i]=rand.nextInt(20);		
	}
	 
	 int[] arr2= new int[6];
	 for (int i = 0; i < arr2.length; i++) {
		 arr2[i] =  rand.nextInt(30);
		
	}
	 Arrays.sort(arr1);
	 Arrays.sort(arr2);
	 findMedianByMerge(arr1, arr2);

	 System.out.println(Arrays.toString(arr1));
	 System.out.println(Arrays.toString(arr2));
	}
}

