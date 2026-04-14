class Solution {
    public int[] numberGame(int[] nums){
       // int [] ans = new int[nums.length];
        Arrays.sort(nums);

        int i = 0;
        while(i < nums.length){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;

            i += 2;
        }
        return nums;
    }
}