class Solution {
    public int missingNumber(int[] nums) {
        int sum =0;
        int total = 0;
        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
        }
        for(int j=0; j<=nums.length; j++) {
            total = total + j;
        }
        return total-sum;
    }
}