package code;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtilities {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Tree root= new Tree(5);
     Tree root_l= new Tree(4);
     Tree root_r= new Tree(10);
     root.add2left(root_l);
     root.add2right(root_r);        
     Tree root_r_l= new Tree(6);
     Tree root_r_r= new Tree(15);
     root_r.add2left(root_r_l);
     root_r.add2right(root_r_r);
     
     print_level(root);
	}
	
	private static void print_level(Tree root){		
		Queue<Tree> q = new LinkedList<Tree>(); 
		
		if(root==null){
			System.out.println("Empty Tree");
			return;
		}
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()){
		Tree front=  q.remove();
		
		if(front==null){
			System.out.println();
			continue;
		}
		Tree l=front.getLeft();
		if(l!=null){
		q.add(l);	
		}
		
		Tree r=front.getRight();
		if(r!=null){
		q.add(r);	
		}
		q.add(null);
		System.out.print(" " +front.getData() +" ");
		
		}
		
	}

}

