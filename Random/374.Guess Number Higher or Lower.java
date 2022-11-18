/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

//Approach-1 : Using Linear Search (TLE)
// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
//         for(int i=1;i<=n;i++){
//             if(guess(i)==0){
//                 return i;
//             }
//         }
       
//        return 0;
//     }
// }

//Approach-2 : Using Binary Search (0 ms)
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int first = 1;
        int last = n;
        int mid;
        while (first <= last) {
            mid = first + (last - first) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;


    }
}