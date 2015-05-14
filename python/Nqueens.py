class Solution:
    # @return a list of lists of string
    def solveNQueens(self, n):
        
        if n==0:
            return []
        result=[]
        if 1<n<4:
            return [['*']*n  for i in range(0,n) ]
        board=[-1]*n



    def sol(self, r,c, n, board,res):
        for i in range(r, n):
            for j in  range(c,n):
                if self.isSafe(board,i,j):
                    board[i]=j
                    if i==n-1:
                        res.add(board)
                else:
                    if j==n-1:
                        return

    def isSafe(self, board,row,col):
        if row==0:
            return True
        #vertical check
        if col in set(board):
            return False
        #horizental check
        if board[row]!=-1:
            return False
        #diagonal check
        for r in range(0,row):
            c=board[r]
            if abs(col-c)==abs(row-r):
                return False

        return True

    def reset(self, board, row):
        board[row]=-1
        pass

    def make_solution(self, board):
        pass

if __name__=='__main__':
    pass
else:
    pass
