# @param board, a 2D array
class Solution:
    # Do not return any value.
    # Capture all regions by modifying the input board in-place.

    def __init__(self):
        pass

    def solve(self, board):
        if len(board)<3:
            return

        visited=[[False]*len(board[sz]) for sz in range(0, len(board))]
        not_island=set()
        for r in range(0, len(board)):
            for c in range(0, len(board[r])):
                if  board[r][c] =='X':
                    continue
                else:
                    if visited[r][c]:
                        continue
                    else:
                        path=set()
                        self.doDFS(board, visited, r, c,path, not_island)


        for  r in range(1, len(board)-1):
            for c in range(1, len(board[r])-1):
                if board[r][c]=='O' and (r,c) not  in not_island:
                    board[r][c]='X'


    def doDFS(self,board,visited,row,col, path, not_island):
       if row<0 or row >=len(board) or col<0 or col>=len(board[row]):
            return

       if  row==0 or col==0 or  col== len(board[row])-1 or row== len(board)-1:
            if  board[row][col]=='X':
                return
            else:
                not_island.update(path)
                return


       if (row,col) in visited:
           return

       visited[row][col]=True

       if board[row][col]=='O':
           path.add((row,col))
       else:
            return

       # edges are from O to O nodes
       self.doDFS(board,visited,row+1,col,path,not_island)
       self.doDFS(board,visited,row,col+1, path, not_island)
       self.doDFS(board,visited,row,col-1,path, not_island)
       self.doDFS(board,visited,row-1,col,path, not_island)


if __name__=='__main__':
    board=[['O','O','O'], ['O','O','O'], ['O','O','O']]
    sol= Solution()
    sol.solve(board)
    print board

else:
    pass
