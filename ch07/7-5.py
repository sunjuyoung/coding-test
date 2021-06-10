
def search(array,start,end,target):
    if start > end:
        return "None"

    mid = (start + end) //2

    if array[mid] == target:
        return "야스"
    
    if array[mid] > target:
        return search(array,start,mid-1,target)
    elif array[mid]< target:
        return search(array,mid+1,end,target)
    



n = int(input())

array = list(map(int,input().split()))

m = int(input())

array2 = list(map(int,input().split()))

for i in range(m):
    result = search(array,0,n-1,array2[i])
    print(result)

