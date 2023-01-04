class Solution {
    public boolean isAnagram(String s, String t) {
        //Approach 1 (Using HashMap)
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char valueOfS = s.charAt(i);
            if (hm.containsKey(valueOfS)) {
                hm.put(valueOfS, hm.get(valueOfS) + 1);
            } else {
                hm.put(valueOfS, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char valueOfT = t.charAt(i);
            if (hm.containsKey(valueOfT) && hm.get(valueOfT) > 0) {
                hm.put(valueOfT, hm.get(valueOfT) - 1);
                count++;
            } else {
                hm.put(valueOfT, 1);
            }
        }

        if (count == t.length()) {
            hm.clear();
        }

        return hm.size() == 0;


        //Approach 2 (Using HashMap)
//        if (s.length() != t.length()) {
//            return false;
//        }
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
//            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) - 1);
//        }
//        for (char c : hm.keySet()) {
//            if (hm.get(c) != 0) {
//                return false;
//            }
//        }
//        return true;


        //Approach 3 (Using Array)
//        int[] charTable = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            charTable[s.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            charTable[t.charAt(i) - 'a']--;
//        }
//        for (int i : charTable) {
//            if (i != 0) {
//                return false;
//            }
//        }
//        return true;

    }
}