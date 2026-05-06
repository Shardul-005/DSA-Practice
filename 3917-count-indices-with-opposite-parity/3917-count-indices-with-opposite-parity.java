class Solution {
    public int[] countOppositeParity(int[] nums) {
        int total_even = 0;
        int total_odd = 0;
        int [] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                total_even++;
            }
            else{
                total_odd++;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 != 0){
                total_odd -= 1;
                ans[i] = total_even ;
            }
            else{
                total_even -= 1;
                ans[i] = total_odd ;
            }
        }
        return ans;
    }
}