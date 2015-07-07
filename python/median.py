

def find_topk_element(arr1, arr2, l1,r1,l2,r2,k):

    #invalid cases

    if k>len(arr2)+ len(arr1) or k<=0:
        return None

    if l1>r1 or l2>r2:
        return None

    #Base case
    if k==1:
        return min(arr1[l1], arr2[l2])

    #Now the general case.
    mid1=arr1[int ((l1+r1)/2)]-l1+1
    mid2=arr2[int ((l2+r2)/2)]-l2+1

    if mid1+mid2< k:
        #this means that our search space is short
        pass



    elif mid1+mid2>k:
        l1=mid1-1;
        l2=mid2-1;
        find_topk_element(arr1,arr2,l1, r1,l2,r2, k-l1-l2-2)

    else:
        #
        return max(arr1[l1], arr2[l2])






if __name__=='__main__':
    arr1 =[1,5,10]
    arr2= [3,6]
    k=1

    find_topk_element()

else:
    pass
