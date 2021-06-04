array = [5,7,9,0,3,1,6,2,4,8]

def quick_sort(array):

    pivot = array[0]
    tail = array[1:] # 피벗을 제외한 리스트

    left_side = [x for x in tail if x<= pivot]
    