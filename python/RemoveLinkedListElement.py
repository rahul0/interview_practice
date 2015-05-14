# Definition for singly-linked list.

import sys

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __str__(self):
        return  str(self.val) if self else '-'


class Solution:
    # @param {ListNode} head
    # @param {integer} val
    # @return {ListNode}
    def removeElements(self, head, val):
        if not head:
            return

        dummy=ListNode(sys.maxint)
        dummy.next=head
        ptr=dummy

        while ptr.next !=None:
           if  ptr.next.val==val:
               temp=ptr.next.next
               ptr.next=temp
           else:
               ptr=ptr.next

        return dummy.next

if __name__=='__main__':
    h=ListNode(10)
    sol=Solution();
    res=sol.removeElements(h,10)
    print res
else:
    pass
