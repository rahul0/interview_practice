package code;

public class Tree {

	private Tree left=null;
	private Tree right=null;
	private  int data=-1;
	
	public Tree(int data_){
		data=data_;
	}
	
	public int getData() {
		return data;
	}
	
	public Tree getLeft() {
		return left;
	}
	public Tree getRight() {
		return right;
	}
	
	public void add2left(Tree l){
	   left=l;
	}
	
	public void add2right(Tree r){
		right=r;
	}
	
}

