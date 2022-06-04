public class SlidingWindow {

    //given array of size n, find max sum of any k consecutive elements

    public int findMaxSum(int[] arr, int k) {
        int n = arr.length;

        if(n < k)
            return -1;

        int sum=0;
        for(int i=0; i<k; i++)
            sum += arr[i];

        int result = sum;
        for(int i=k; i<n; i++){
            sum += arr[i] - arr[i-k];
            result = Math.max(result, sum);
        }
        return result;
    }

    public int lengthOfLongestSubstring(String s) {
        int start = 0, result = 0;
        boolean[] countMap = new boolean[256];

        for(int end = 0; end<s.length(); end++){
            while(countMap[s.charAt(end)]){
                countMap[s.charAt(start)] = false;
                start++;
            }
            countMap[s.charAt(end)] = true;
            result = Math.max(result, end-start+1);
        }

        return result;
    }

    public static void main(String[] args){
        SlidingWindow thisclass = new SlidingWindow();
        int[] arr = {1,4,7,-1,8,-6,5,-2,1,-5,3};
        System.out.println(thisclass.findMaxSum(arr, 3));
    }

}
