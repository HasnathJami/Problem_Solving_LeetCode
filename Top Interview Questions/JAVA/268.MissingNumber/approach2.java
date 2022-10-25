//Approach2 //1ms
class Solution {
    public int missingNumber(int[] nums) {
        int partialSum = 0;
        int totalSum = ((nums.length + 1) * (nums.length)) / 2;

        for (int i = 0; i < nums.length; i++) {

            partialSum = partialSum + nums[i];
        }
        return totalSum - partialSum;
    }
}