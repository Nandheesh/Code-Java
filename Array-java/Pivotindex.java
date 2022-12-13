Pivotinde or Middle index in a Array

Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4

Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0

Input: nums = [2,5]
Output: -1
Explanation: There is no valid middleIndex

class Solution {
    public static void main(String[] ar) {
      int nums[] = {2,3,-1,8,4};
        if(nums.length == 0) return -1;
        int leftsum = 0 , rightsum = 0;
        for(int numb : nums)
            rightsum += numb;
        for(int i = 0 ;i<nums.length ;i++){
            rightsum -= nums[i];
            if(rightsum == leftsum)
            return i;
            leftsum += nums[i];    
        }
            return -1;
    }
}
