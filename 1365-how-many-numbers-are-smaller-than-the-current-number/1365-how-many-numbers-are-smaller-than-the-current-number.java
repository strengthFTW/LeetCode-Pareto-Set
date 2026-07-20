class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int [] sorted = new int[n];
        for(int i=0; i<n; i++) {
            sorted[i] = nums[i];
        }
        Arrays.sort(sorted);

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(!map.containsKey(sorted[i])) {
                map.put(sorted[i],i);
            }
        }

        int [] result = new int[n];
        for(int i=0; i<n; i++) {
            result[i] = map.get(nums[i]);
        }
        return result;
    }
}