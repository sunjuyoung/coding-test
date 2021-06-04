package ch06;

/**
 * 퀵정렬
 */
public class ch64 {
    public static void main(String[] args) {
        
        int[] array  = {5,7,9,0,3,1,6,2,4,8};

        quickSort(array, 0, array.length-1);

        for(int a : array){
            System.out.printf("%3d",a);
        }

    }
    public static void quickSort(int [] arr,int start,int end){
        if(start >= end) return;
        int left = start +1;
        int right = end;
        int pivot = start;

        while(left<=right){            
            while(left <= end && arr[left] <= arr[pivot] ){
                left++;
            }
            while(right > start && arr[right] >= arr[pivot]){
                right--;
            }

            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }else{
                int temp = arr[right];
                arr[right] = arr[pivot];
                arr[pivot] = temp;
            }
            
        }
        quickSort(arr, start, right-1);
        quickSort(arr, right+1, end);

    }
}
