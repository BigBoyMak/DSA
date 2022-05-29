public class BinarySearchInSequence {

    // find first occurrence of 1
    //example input [0,0,0,0,0,0,0,1,1,1,1,1]
    public int findFirst(int[] arr) {
        int left = 0, right=arr.length-1;

        int result = -1;
        while(left <= right) {
            int mid = left + (right-left)/2;

            if(arr[mid] == 0)
                left = mid + 1;
            else {
                right = mid - 1;
                result = mid;
            }
        }
        return result;
    }

    //find last occurrence of 0
    //example input [0,0,0,0,0,0,0,1,1,1,1,1]
    public int findLast(int[] arr) {
        int left = 0, right = arr.length-1;

        int result = -1;
        while(left <= right) {
            int mid = left + (right-left)/2;

            if(arr[mid] == 0) {
                result = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return result;
    }

}
