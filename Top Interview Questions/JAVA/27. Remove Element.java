//  Two Pointer
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int first = 0;
//         int last = nums.length - 1;
//         int k = 0;
//         while (first <= last) {
//             if (nums[first] == val && nums[last] == val) {
//                 last--;
//                 k++;

//             } else if (nums[first] == val && nums[last] != val) {
//                 int temp = nums[first];
//                 nums[first] = nums[last];
//                 nums[last] = temp;
//                 first++;
//                 last--;
//                 k++;
//             } else if (nums[first] != val && nums[last] == val) {
//                 first++;
//                 last--;
//                 k++;

//             } else {
//                 first++;
//             }
//         }

//         return nums.length - k;
//     }
// }

// Using Two Pointer (slow and fast pointer)
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int index = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != val) {
//                // int temp =  nums[index];
//                 nums[index] = nums[i];
//                // nums[i] = temp;
//                 index++;
//             }
//         }
//         return index;
//     }
// }

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                swap(nums, index, i);
                index++;
            }
        }
        return index;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

//Using array and occurances
//formula = {
 //   valueIndex = currenValueIndex(i) - occurances
//}
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int occurrences = 0; // Count of occurrences of the value 'val' in the array
        
//         // Iterate through the array
//         for (int i = 0; i < nums.length; i++) {
//             // Check if the current element is equal to 'val'
//             if (nums[i] == val) {
//                 occurrences++; // Increment the count of occurrences
//             } else if (i != 0) {
//                 // If the current element is not equal to 'val' and it's not the first element
//                 // Move the current element to the correct position considering the occurrences
//                 nums[i - occurrences] = nums[i];
//             }
//         }
        
//         return nums.length - occurrences; // Return the length of the array without occurrences of 'val'
//     }
// }
