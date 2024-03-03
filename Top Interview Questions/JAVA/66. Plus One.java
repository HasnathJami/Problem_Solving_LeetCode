//class Solution {
//    public int[] plusOne(int[] digits) {
//        int len = digits.length;
//        int tempDigits[] = new int[len + 1];
//        int j = len;
//        Boolean hasFirstValueContainedCarry = false;
//        Boolean isAlreadyExecuted = false;
//        Boolean isAlreadyValueIncreased = false;
//
//        for (int i = digits.length - 1; i >= 0; i--) {
//
//            if (digits[i] >= 0 && digits[i] <= 8) {
//                if(!isAlreadyValueIncreased) {
//                    digits[i] = digits[i] + 1;
//                }
//                break;
//
//            } else {
//
//                if (digits[i] == 9 && isAlreadyExecuted) {
//                    break;
//                }
//                else if (digits[i] == 9) {
//                    isAlreadyExecuted = true;
//                }
//
//                if (i != 0) {
//                    digits[i] = 0;
//                    isAlreadyValueIncreased = true;
//                    digits[i - 1] = digits[i - 1] + 1;
//
//                } else {
//                    if (digits[i] % 10 == 0 || len <= 1) {
//                        hasFirstValueContainedCarry = true;
//                    }
//                    tempDigits[j - 1] = 1;
//
//                }
//            }
//
//            j--;
//        }
//        if (hasFirstValueContainedCarry) {
//            return tempDigits;
//        } else {
//            return digits;
//        }
//
//    }
//}

// Optimal Solution with Better Space Complexity
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;


        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] < 10) {
                return digits;
            }

            digits[i] = 0;
        }

        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
