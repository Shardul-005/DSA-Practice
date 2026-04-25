class Solution {
    public void wiggleSort(int[] nums) {
        int [] ans = new int[nums.length];
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;

        int mid = low + (high-low)/2;
        int end = nums.length-1;

        int k = 0;
        while(k < nums.length){
            ans[k++] = nums[mid--];
            if(k < nums.length){
                ans[k++] = nums[end--];
            }  
        }

        for(int i=0; i<ans.length; i++){
            nums[i] = ans[i];
        }
    }
}