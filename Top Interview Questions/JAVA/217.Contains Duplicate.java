//Approach 1 (Using Sorted Array) //46ms
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

//Appraoch 2 (Using HashMap) //0ms
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]))
                hm.put(nums[i], hm.get(nums[i]) + 1);
            else {
                hm.put(nums[i], 1);
            }
        }

        for (int i = 0; i < hm.size(); i++) {
            if (hm.containsKey(i) && hm.get(i) > 1) {
                return true;
            }
        }

        return false;
    }
}