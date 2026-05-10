class Solution {
    public String[] findRelativeRanks(int[] score) {
       String [] ans = new String[score.length];
        int[] temp = Arrays.copyOf(score, score.length);
        
        Arrays.sort(temp);
        
        for (int i = 0, j = temp.length - 1; i < j; i++, j--) {
            int x = temp[i];
            temp[i] = temp[j];
            temp[j] = x;
        }
        HashMap<Integer, String> mp = new HashMap<>();

        if (temp.length > 0) mp.put(temp[0], "Gold Medal");
        if (temp.length > 1) mp.put(temp[1], "Silver Medal");
        if (temp.length > 2) mp.put(temp[2], "Bronze Medal");

        for(int i=3; i < temp.length; i++){
            mp.put(temp[i], i+1+"");
        }
        
        for(int i=0; i<score.length; i++){
            ans[i] = mp.get(score[i]);
        }
        return ans;
    }
}