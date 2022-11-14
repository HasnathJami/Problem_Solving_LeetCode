//Approach 1 (Using Sorted Array) //49ms
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i]==nums[i+1]){
//               return true;
//            }
//        }
//        return false;
//     }
// }

//Appraoch 2 (Using HashMap) //74ms
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

//         for (int i = 0; i < nums.length; i++) {
//             if (hm.containsKey(nums[i]))
//                 hm.put(nums[i], hm.get(nums[i]) + 1);
//             else {
//                 hm.put(nums[i], 1);
//             }
//         }

//         for (int i = 0; i < hm.size(); i++) {
//             if (hm.get(nums[i]) > 1) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }

//Approach 3 (Using HashSet) //12ms
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }
        if (nums.length <= 1) {
            return false;
        }
        for (int num : nums) {
            if (hs.contains(num)) {
                return true;
            }
            hs.add(num);
        }
        return false;
    }
 }

//Approach 4 (Using Bruteforce) //TLE
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for(int i = 0; i < nums.length; i++) {
//             for(int j = i + 1; j < nums.length; j++) {
//                 if(nums[i] == nums[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//  }
