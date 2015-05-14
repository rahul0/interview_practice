
class Solution:
    def __init__(self):
        pass

    def twoSum(self, nums, target):
        map_={ item:idx+1 for  idx, item in enumerate(nums)}
        for idx,x in enumerate(nums):
              if target-x  in map_:
                    print [idx+1,map_[target-x]]


if __name__=='__main__':
    sol=Solution()
    nums=[3,2,4]
    sol.twoSum(nums,6)

else:
    pass

