    # @param board, a 9x9 2D array
class Solution:
    # @return a boolean
    def __init__(self):
        pass

    def isValidSudoku(self, board):

        integers=set(['1','2','3','4','5','6','7','8','9'])
        #check all rows
        print 'processing row'
        for i in range(0,9):
            print  board[i]
            ip=[ x for x in board[i]  if x in integers ]
            print 'ip= {}'.format(ip)
            if len(ip)!= len(set(ip)):
                return False
        #Check all columns
        print 'processing column'
        for i in range(0,9):
            ip=[ board[x][i] for x in range(0,9)  if board[x][i] in integers ]
            print 'ip= {}'.format(ip)
            if len(ip)!= len(set(ip)):
                return False

        #Check all quadrants
        print 'processing quadrants'
        for i in range(0,9,3):
           for step in range(0,9,3):
               ip=[]
               ip.extend([ x for x in board[i][step:step+3] if x in integers])
               ip.extend([ x for x in board[i+1][step:step+3] if x in integers ])
               ip.extend([ x  for x in board[i+2][step:step+3] if x in integers])
               print 'ip= {}'.format(ip)

               if len(ip)!= len(set(ip)):
                return False

        return True


if __name__=='__main__':
    sol= Solution()
    ip=['!!4!!!63!','!!!!!!!!!','5!!!!!!9!','!!!56!!!!','4!3!!!!!1','!!!7!!!!!','!!!5!!!!!','!!!!!!!!!','!!!!!!!!!']
    res=sol.isValidSudoku(ip)
    print res

else:
    pass
