
class Board:

    def __init__(self, N, award_map):
        self.board_size=N
        self.board=[[0]*N for i  in range(0, N) ]


        for i in range(0, N):
            for  j in range (0, N):

                if (i,j)  in  award_map:
                    board[i][j]= award_map[(i,j)]
                else:
                    board[i][j]= 0
        self.visited= [[False]*N for i in range(0, board_size)]

    def apply_negative_weight(self, weight, x, y):
        pass

    def move(self, x,y, steps):

         positions=[]


         for  step in range(6,-1,-1):
             if  y+step >  self.board_size:
                 


    def  do_BFS(self):
        q=[]
        q.extend([i  for i+1 in range(6,-1,0)])

        while q:
            x,y=q.remove(0)

            if x,y ==(N-1,N-1):
                # means we have reached our goal





            pass



    if __name__=='__main__':
        pass
    else:
        pass


