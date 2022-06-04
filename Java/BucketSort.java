import java.util.*;
public class BucketSort {

    public String bucketSort(String sequence) {
        // sequence: abccdcdddbba -> sort by frequency

        int n = sequence.length();
        List<Character>[] bucket = new List[n+1];

        HashMap<Character, Integer> countMap = new HashMap<>();
        for(int i=0; i<sequence.length(); i++){
            char c = sequence.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0)+1);
        }

        for(Character c: countMap.keySet()){
            int count = countMap.get(c);
            if(bucket[count] == null)
                bucket[count] = new ArrayList<>();
            bucket[count].add(c);
        }



        StringBuilder result = new StringBuilder();
        //reverse for frequency in decreasing order
        for(int i=n; i>0; i--){
            if(bucket[i] == null)
                continue;

            for(Character c: bucket[i]){
                for(int j=0; j<i; j++){
                    result.append(c);
                }
            }

        }

        return result.toString();
    }

    //Counting sort:

    //26 english alphabets counting sort

    public String countingSort(String str) {
        int[] countMap = new int[26];

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            countMap[c - 'a']++;
        }

        char[] result = new char[str.length()];
        int index = 0;
        for(int i=0; i<26; i++){
            char c = (char) (i + 'a');
            for(int j=0; j<countMap[i]; j++){
                result[index++] = c;
            }
        }

        return new String(result);
    }

    public static void main(String[] args){
        BucketSort thisclass = new BucketSort();
        String str = "asdfasdfdfkhdiuysdmkansfdk";
        System.out.println(thisclass.bucketSort(str));
        System.out.println(thisclass.countingSort(str));
    }

}
