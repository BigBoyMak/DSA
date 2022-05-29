public class BinarySearchRecursive {


    public int binarySearch(int[] arr, int left, int right, int val) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == val)
                return mid;

            if (arr[mid] > val)
                return binarySearch(arr, left, mid - 1, val);


            return binarySearch(arr, mid + 1, right, val);
        }

        return -1;
    }

}
