class Solution:
    # @param start, a string
    # @param end, a string
    # @param dict, a set of string
    # @return an integer

    def __init__(self):
        pass

    def ladderLength(self, start, end, dict1):
        if start not in dict1 or end not in dict1:
            return 0
            
        if start==end:
            return 0
        return self.doBFS(start,end, dict1)
    
    def doBFS(self, start, goal,dict1):
        d=[start]
        visited=set()
        dist=1
        while d:
            node=d.pop(0)
            if node==goal:
                break

            nodes=list(self.hamming_distance(node,dict1-visited,1))
            visited.add(node)
            d.extend(nodes)
            dist=dist+1
        return dist

    #@return hamming distance between two words
    def hamming_distance(self, source,nodeset, distance_allowed):
        # all words are of same length
        result=set()
        for word in nodeset:
            dist=sum(ch1!=ch2  for ch1,ch2 in  zip(word,source))
            if dist==distance_allowed:
                result.add(word)
        return result

if __name__=='__main__':
    dict_=set(' '.join(open('test.txt').readlines()).split(' '))
    src='sand'
    goal='acne'
    sol= Solution()
    print  sol.ladderLength(src,goal, dict_)
else:
    pass

