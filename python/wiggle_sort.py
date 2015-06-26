

def wiggle_sort(array):
    """(1,2,8,9,3,5) => (2,5,3,8,1,9)"""
    if len(array)==1:
        return array
    s=0
    l=1
    

    while(s<=len(arr) and  l <= len(arr) and l<s):

        if  s%2==0:
            if arr[s] <arr[l]:
                arr[l],arr[s]=arr[s],arr[l]
                s+=1

        else:
            if arr[s] > arr[l]:
                arr[l],arr[s]=arr[s],arr[l]
                s+=1

        l+=1

    print  arr





if __name__=='__main__':
    pass
else:
    pass
