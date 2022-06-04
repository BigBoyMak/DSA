import java.util.*;
public class CountMap {

    public HashMap<Character, Integer> createCountMap(String sequence) {

        // using hashmap if sequence contains mixed values (lower & uppercase, numbers, etc)
        HashMap<Character, Integer> countMap = new HashMap<>();

        for(int i=0; i<sequence.length(); i++) {
            char c = sequence.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        return countMap;
    }

    public int[] createCountMapArr(String sequence){
        //using integer array as count map
        int[] countMap = new int[26]; // if only lower or upper case alphabets

        for(int i=0; i<sequence.length(); i++) {
            char c = sequence.charAt(i);
            countMap[c - 'a'] += 1;
        }
        return countMap;
    }

    public static void main(String[] args){
        CountMap thisclass = new CountMap();
        String str = "skajfhsdh";
        System.out.println(thisclass.createCountMap(str));
        System.out.println(Arrays.toString(thisclass.createCountMapArr(str)));
    }

}
