//1941. Check if All Characters Have Equal Number of Occurrences

import java.util.HashMap;
import java.util.Map;
public class leet_1941 {


        public static boolean areOccurrencesEqual(String s) {
            Map<Character, Integer> charCountMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            int expectedFrequency = charCountMap.get(s.charAt(0));
            for (int frequency : charCountMap.values()) {
                if (frequency != expectedFrequency) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            String s = "abacbc";
            System.out.println(areOccurrencesEqual(s)); // Output: true
        }
    }


