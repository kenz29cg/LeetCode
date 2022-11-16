class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>(); // Integer, HashMap
        for (int i = 0; i < nums.length; i++) {
            int otherPart = target - nums[i]; 
            if (sum.containsKey(otherPart))
            return new int[] {sum.get(otherPart), i};
            sum.put(nums[i], i);
        }   
        return new int[] {}; // return an empty array
    }   
}
