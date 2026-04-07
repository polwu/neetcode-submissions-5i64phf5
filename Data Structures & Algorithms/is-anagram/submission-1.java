class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> frequency1 = new HashMap<>();
        Map<Character, Integer> frequency2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            frequency1.put(s.charAt(i), frequency1.getOrDefault(s.charAt(i), 0) + 1);
            frequency2.put(t.charAt(i), frequency2.getOrDefault(t.charAt(i), 0) + 1);
        }
        return frequency1.equals(frequency2);
    }
}
