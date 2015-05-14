package code;

import java.math.*;
import java.util.Arrays;
import java.util.Random;
public class QuickSort {
    public int [] arr; 
	public QuickSort(int [] data) {
		// TODO Auto-generated constructor stub
		arr=data;
	}
	
	public void qsort(int st, int end) {
	 
		if (st<end){
			int partition= partition_array(st, end);
			qsort(st, partition-1);
			qsort(partition+1, end);			
		}
	}
	
	
	private void exchange(int x, int y){
		int temp= arr[x];
		arr[x]= arr[y];
		arr[y]= temp;
	}
	private int partition_array( int start_index, int end_index){
		
		int small_ptr=start_index-1;
		int pivot=arr[end_index];		
		for (int i = start_index; i < end_index; i++) {		
			if(arr[i] <= pivot){
				small_ptr++;
				exchange(small_ptr, i);
			}
		}
	 small_ptr++;
	 exchange(small_ptr, end_index);	
	return small_ptr;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
       int sz=r.nextInt(10)+1;
       int[] arr= new int[sz];
       
       for (int i=0; i< arr.length; i++){
    	   arr[i]=r.nextInt(30);     	   
       }
       
       QuickSort q = new QuickSort(arr);
       q.qsort(0, sz-1);
       System.out.println(Arrays.toString(q.arr));
       	
       //System.out.format("Array: %s ", Arrays.toString(arr));
       
	}

}
