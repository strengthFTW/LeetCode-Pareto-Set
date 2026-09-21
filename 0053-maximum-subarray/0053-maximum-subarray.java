class Solution {
    public int maxSubArray(int[] nums) {
        
        // Kadane's Algorithm

        int curr_sum = nums[0];
        int max_sum = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(curr_sum + nums[i] > nums[i]) {
                curr_sum += nums[i];
            }
            else{
                curr_sum = nums[i];
            }
            if(curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }
        return max_sum;
    }
}