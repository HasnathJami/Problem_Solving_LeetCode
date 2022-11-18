//Approach 1 (Using Two Pointer Method And Custom AlphaNumeric Separation Part ) : 301ms
class Solution {
       public boolean isPalindrome(String s) {
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            if (c >= 'a' && c <= 'z') {
                a += c;
            }

            if (c >= '0' && c <= '9'){
                a+= c;
            }
        }

        int first = 0;
        int last = a.length() - 1;
        while (first <= last) {
            if (!(a.charAt(first) == a.charAt(last))) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}

//Approach 2 (Using Two Pointer Method But Modified The First AlphaNumeric Separation Part) : 33ms
// class Solution {
//        public boolean isPalindrome(String s) {
//         String a = s.toLowerCase().replaceAll("[^0-9a-z]", "");
//         int first = 0;
//         int last = a.length() - 1;
//         while (first <= last) {
//             if (!(a.charAt(first) == a.charAt(last))) {
//                 return false;
//             }
//             first++;
//             last--;
//         }
//         return true;
//     }
// }

//Approach 3 (Using Built-In Library (Reverse Function and AlphaNumeric Separation Function) ) : 37ms
// class Solution {
//        public boolean isPalindrome(String s) {
//         String a= s.toLowerCase().replaceAll("[^0-9a-z]","");
//         String b= new StringBuffer(a).reverse().toString();
//         return a.equals(b);

//     }
// }
