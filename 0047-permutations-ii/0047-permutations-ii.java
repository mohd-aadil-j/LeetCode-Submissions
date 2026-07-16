class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        computePerm(0, nums, result);
        return result;
    }

    public void computePerm(int ind, int[] nums, List<List<Integer>> result) {
        if (ind == nums.length) {
            List<Integer> currentPerm = new ArrayList<>();
            for (int num : nums) {
                currentPerm.add(num);
            }
            result.add(currentPerm);
            return;
        }

        Set<Integer> released = new HashSet<>();

        for (int i = ind; i < nums.length; i++) {
            if (released.contains(nums[i])) {
                continue; 
            }
            released.add(nums[i]);

            swap(nums, ind, i);

            computePerm(ind + 1, nums, result);

            swap(nums, ind, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}