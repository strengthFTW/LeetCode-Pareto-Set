class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            }
        }
        for(int j=1; j<=nums.length; j++) {
            if(!set.contains(j)) {
                list.add(j);
            }
        }
        return list;
    }
}