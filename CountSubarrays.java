import java.util.HashMap;
import java.util.Map;

public class CountSubarrays {
    public static int countSubarrays(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        map.put(0, 1);

        for (int num : arr) {
            sum += (num == 0) ? -1 : 1;
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        System.out.println("Count: " + countSubarrays(arr));
    }
}
