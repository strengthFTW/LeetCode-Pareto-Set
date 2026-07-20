class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] temp = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        // 1 2 2 3 8

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(temp[i])) {
                map.put(temp[i],i);
            }
        }
        //map = 1:0, 2:1, 3:3, 8:4

        int [] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            result[i] = map.get(nums[i]);
        }
        return result;
    }
}