public class BinarySearchInRotatedArray {

    // [ 3, 5, 6, 8, 9, 1, 2] -> output: 5

    public int binarySearchFindMin (int[] arr) {
        int left = 0, right = arr.length -1;

        while(left < right) {
            int mid = left + (right-left)/2;

            if(arr[mid] < arr[right])
                right = mid;
            else
                left = mid + 1;
        }

        return right;
    }

}
