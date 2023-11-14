//Brute Force Approach (TLE) 
// class Solution {
//     public void rotate(int[] nums, int k) {
//         for(int i=0;i<k;i++){
//             int first = 0;
//         int last = nums.length-1;
//         int temp = nums[last];
//         while(first<last) {
//            nums[last] = nums[last-1];
//            last--;
//         }
//         nums[0] = temp;
//         }
       
//     }
// }

//Using Two Pointers along with Arithmetic - TC:O(N), SC:O(1)
class Solution {
    public void rotate(int[] nums, int k) {
      int len = nums.length-1;
      k = k % (len + 1);
      reverse(nums, 0, len);
      reverse(nums, 0, k-1);
      reverse(nums, k, len);
    }

    public void reverse(int[] nums, int first, int last) {
       while(first < last) {
           int temp = nums[first];
           nums[first] = nums[last];
           nums[last] = temp;
           first++;
           last--;
       }
    }
}