class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> compliment = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int partner = target - nums[i];
            if (compliment.containsKey(partner)) {
                return new int[]{compliment.get(partner), i};
            } else {
                compliment.put(nums[i], i);
            }
        }
        return null;
    }
}
