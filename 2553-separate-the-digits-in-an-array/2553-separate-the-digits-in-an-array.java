class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int ele : nums){
            List<Integer> temp = new ArrayList<>();
            while(ele > 0){
                temp.add(ele % 10);
                ele = ele / 10;
            }
            Collections.reverse(temp);
            ans.addAll(temp);
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i); 
        }

        return result;
    }
}