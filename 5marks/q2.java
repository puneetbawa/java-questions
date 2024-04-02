import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > 2) {
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(lengthOfLongestSubstringTwoDistinct(s));
    }
}
