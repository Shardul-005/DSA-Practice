class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int multi = 1;
        int original = n;
        while(original > 0){
            int digit = original % 10;
            sum += digit;
            multi *= digit;
            original /= 10;
        }

        int ans = sum + multi;
        if(n % ans == 0) return true;
        return false;
    }
}