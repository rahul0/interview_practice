package code;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval implements Comparable<Interval>{
	int start;
	int end;
	public Interval(int start_, int end_){
		start= start_;
		end= end_;
	}
	@Override
	public int compareTo(Interval o) {
		// TODO Auto-generated method stub
		return start - o.start;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+Integer.toString(start) + "," + Integer.toString(end) + ")";
	}
}

class IntervalComparator implements  Comparator<Interval>{

	@Override
	public int compare(Interval o1, Interval o2) {
		// TODO Auto-generated method stub		
		return o1.start - o1.end;
	}
	
}

public class MergeInterval {
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Interval> seq= new ArrayList();
       Interval i1= new Interval(3, 2);
       seq.add(i1);
       Interval i2= new Interval(1, 2);
       seq.add(i2);
       seq.add(i2);
       seq.add(i1);
       Collections.sort(seq);
       ArrayList<Interval> merged=  new ArrayList();
       
       //
       Interval  first=   seq.remove(0);
       while(seq.size()>0){
    	   if first.end
       }
       
        
       
       System.out.println(seq);
	}

}
