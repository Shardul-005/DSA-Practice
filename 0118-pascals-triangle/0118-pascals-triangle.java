class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if (numRows >= 1) {
            ans.add(Arrays.asList(1));
        }

        if (numRows >= 2) {
            ans.add(Arrays.asList(1, 1));
        }

        for (int i = 3; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prevRow = ans.get(ans.size() - 1);
            for (int j = 0; j < prevRow.size()-1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            row.add(1);
            ans.add(row);
        }

        return ans;
    }
}