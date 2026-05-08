class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int size = 0;
        int end = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            end = Math.max(end,s.lastIndexOf(ch));
            size++;
             if(i == end){
                ans.add(size);
                size = 0;
            }
            
        }
        return ans;
    }
}