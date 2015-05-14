package code;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.math.*;

public class Pq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		myIntComparator my = new myIntComparator();
		PriorityQueue< Integer>  pq= new PriorityQueue<Integer>(10, my);
		for (int i = 0; i < 5; i++) {
			int x=r.nextInt(30);
			System.out.format(" %d ", x);
			pq.add(x);	
		}
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println(pq.remove());;	
		}		

	}

}

 class myIntComparator implements  Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}
