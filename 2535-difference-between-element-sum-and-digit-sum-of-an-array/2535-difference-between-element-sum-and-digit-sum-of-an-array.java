class Solution {
    public int differenceOfSum(int[] nums) {
        int sum_elem = 0;
        int sum_digit = 0;
        for(int i = 0; i < nums.length; i++){
            sum_elem += nums[i];
            while(nums[i] > 0){
                int digit = nums[i] % 10;
                sum_digit += digit;
                nums[i] /= 10;
            }
        }
        return Math.abs(sum_elem - sum_digit);
    }
}