class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxlen = 0;
        for(String str : sentences){
            int current_len = str.split(" ").length;
            maxlen = Math.max(maxlen,current_len);
        }
        return maxlen;
    }
}