class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a,b) -> (b[1]-b[0]) - (a[1] - a[0]));

        int energy = 0;
        int ans = 0;

        for(int [] ele : tasks){
            int actual = ele[0];
            int minimum = ele[1];

            if(energy < minimum){
                ans += (minimum - energy);
                energy = minimum;
            }
            energy -= actual;
        }
        return ans;
    }
}