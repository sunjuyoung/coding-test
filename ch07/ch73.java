package ch07;

public class ch73 {
    
    public static void main(String[] args) {
        
    }




    static int search(int[] array, int start, int end, int target){
  

        while(start <= end){
            int mid = (start+end)/2;

            if(array[mid] == target){
                return mid;
            }
            if(array[mid] > target){
                end = mid -1;
            }else if(array[mid] < target){
                start = mid +1;
            }
        }

        return -1;
    }
    
}
