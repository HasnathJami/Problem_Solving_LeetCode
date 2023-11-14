class Solution {
    public int findMinimum(int a, int b) {
        if(a>=b) {
            return b;
        } else {
            return a;
        }
    }
    
      public int findMaximum(int a, int b) {
        if(a >= b) {
            return a;
        } else {
            return b;
        }
    }
    
    
    public int maxArea(int[] height) {
        int min = 0;
        int max = -1;
        int first = 0;
        int last = height.length - 1;
        
        while(first < last) {
            min = findMinimum(height[first], height[last]);
            //diff = last - first;
            max = findMaximum(max, (last - first) * min);
            if(min == height[first] && min == height[last]) {
                first ++;
                last --;
            } else if (min == height[last]) {
                last--;
            } else {
                first ++;
            }
        }
        
        return max;
        
    }
}