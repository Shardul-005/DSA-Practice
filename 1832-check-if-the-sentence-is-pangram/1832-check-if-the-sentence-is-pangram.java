class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> st = new HashSet<>();

        for(char ch : sentence.toCharArray()){
            st.add(ch);
        }

        return st.size() == 26;
    } 
}