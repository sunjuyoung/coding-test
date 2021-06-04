package ch06;

/**
 * 퀵정렬
 */
public class ch644 {
    public static void main(String[] args) {
     
        

    }


    public static void quickSort(int [] arr, int left, int right){
        int n = arr.length;
      
        int pivot = arr[n-1];

        while(left <= right){
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;

            if(left<=right){
                swap(arr, left, right);
            }
        }
    
    }

    public static void swap(int [] arr, int left , int right){
        int temp = arr[right];
        arr[right]= arr[left];
        arr[left] = temp;
    }
}
