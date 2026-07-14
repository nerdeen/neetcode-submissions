class Solution {
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int l = 0, res = 0;
        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r],0) + 1);
            while (map.lastKey() - map.firstKey() > limit) {
                int cnt = map.get(nums[l]);
                if (cnt == 1) map.remove(nums[l]);
                else map.put(nums[l], cnt - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}