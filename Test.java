import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        

    int [] arr = {2,6,8,3,5,1,0,9,7,4};
    int [] arr1 = {2,6,8,3,5,1,0,9,7,4};

    Arrays.sort(arr1);
    for(int a : arr1){
        System.out.printf("%3d",a);
    }

    System.out.println("");

    qq(arr, 0, arr.length-1);

    for(int a : arr){
        System.out.printf("%3d",a);
    }
        
    }

    static void qq(int []array,int start, int end){
        if(start >= end)return;
        int left = start +1;
        int right = end;
        int pivot = start;

        while(left <= right){
            while(left <= end && array[left] <= array[pivot]){
                left++;
            }
            while(right > start  && array[right] >= array[pivot]){
                right--;
            }
    
            if(left < right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
    
            }else{
                int temp = array[right];
                array[right] = array[pivot];
                array[pivot] = temp;
            }
        }

  

        qq(array,start , right-1);
        qq(array,right+1 ,end);
    }




}