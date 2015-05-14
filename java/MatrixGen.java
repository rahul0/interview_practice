package code;

public class MatrixGen {

    public static  int[][] generateMatrix(int n) {
        
        int[][] res= new int[n][n];
        gen(res, 0, 0,n, 1);
        return res;
    }
    
    private static void gen(int[][] res, int row_idx, int col_idx, int sz, int val){
        
        if (sz==0 || row_idx>=res.length|| col_idx>=res.length){
            return;
        }
        
        if(sz==1){
            res[row_idx][col_idx]=val;
            return;
        }
        
        //write to columns of the row
        int c=col_idx;
        int r=row_idx;
        for( ; c< col_idx+sz; c++){
          res[row_idx][c]=val++;
        }
        //write to rows of the col
        c--;
        r++;
        
        for(  ; r< row_idx+sz; r++){
          res[r][c]=val++;
        }
        // write to all col
        r--;
        c--;
        for( ; c>= col_idx; c--){
          res[r][c]=val++;
        }
        
       r--;
       c++;       
       
       for( ; r>row_idx; r--){
          res[r][c]=val++;
       }
       gen(res, row_idx+1,col_idx+1, sz-2, val) ;
    
}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=2;
          generateMatrix(n);
	}

}
