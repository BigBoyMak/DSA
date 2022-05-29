public class BinarySearch {

    public int binarySearch(int[] arr, int val) {
        int left = 0, right = arr.length -1;

        while(left <= right) {
            int mid = left + (right-left) / 2; // for int overflow
            if(arr[mid] ==  val)
                return mid;
            if(arr[mid] > val)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }
}
