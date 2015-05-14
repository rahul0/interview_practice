package code;

import java.util.Arrays;

public class MergeSort {
    
	private int []  arr;
	private int []  temp; 
	public MergeSort(int []  array_) {
		// TODO Auto-generated constructor stub
		arr=array_;
		temp= new int[arr.length];
		
	}
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	};
	public void print_sorted(){
		System.out.println(Arrays.toString(temp));
	}
	
	public void merge_sort( int left, int right ){
		System.out.format("merge sort: left= %d , right= %d\n",left,right );
		  if (left<right){
			int split= (left+right)/2;						
			merge_sort(left, split); 
			merge_sort(split+1, right);			
			merge(left, split, right);
		  }
				
	}
	
	private void merge(int left, int junction, int right ){
		System.out.format("Merging: left= %d , junction= %d, right= %d\n",left,junction,right  );		 
		int index=left;
		int left_ptr=left;
		int right_ptr=junction+1; 
		
		//becuase both junction and right are both inclusive
		while(left_ptr <=junction  &&  right_ptr <= right){
			
			if(arr[left_ptr] <= arr[right_ptr]){
				temp[index++] = arr[left_ptr++];				
			}else{
				temp[index++] = arr[right_ptr++];				
			}		
		}
		
		if(left_ptr>junction){
			//then copy  from right side
			for (int k=right_ptr ; k<=right; k++){
				temp[index++] = arr[right_ptr++];
			}
		}else{
			for (int k=left_ptr ; k<= junction; k++){
				temp[index++] = arr[left_ptr++];
			}			
		}		
		
		System.out.format("After merging: %s\n", Arrays.toString(temp));
		
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  arr= {2,5,1,0,25};
		
		MergeSort m= new MergeSort(arr);
		m.merge_sort(0, arr.length-1);
		m.print_sorted();

	}

}
