class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nonDups = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(nonDups.contains(nums[i]))
                return true;
            nonDups.add(nums[i]);
        }
            return false;
    }
}
