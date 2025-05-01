import java.util.HashMap;
import java.util.Map;

public class LongestSubsequence {
    public static int findLongestSubseq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;

        for (int num : arr) {
            map.put(num, 1 + Math.max(map.getOrDefault(num - 1, 0), map.getOrDefault(num + 1, 0)));
            maxLength = Math.max(maxLength, map.get(num));
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 4, 5, 4, 8, 6};
        System.out.println("Longest Subsequence Length: " + findLongestSubseq(arr));
    }
}


