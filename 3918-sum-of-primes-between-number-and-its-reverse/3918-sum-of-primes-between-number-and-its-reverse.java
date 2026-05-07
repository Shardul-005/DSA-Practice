class Solution {
    public int sumOfPrimesInRange(int n) {
        //int reversed = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
        int revnum = 0;
        int original = n;
        while(original > 0) {
            int digit = original % 10;
            revnum = revnum * 10 + digit;
            original = original / 10;
        }

        int start = Math.min(n,revnum);
        int end = Math.max(n,revnum);

        int sum = 0;
        
        for(int i = start; i <= end; i++){

           if(i < 2) continue;

           boolean isPrime = true;
           for(int j=2; j <= Math.sqrt(i); j++){
              if(i % j == 0){
                isPrime = false;
                break;
              }
           } 

           if(isPrime) sum += i;

        }
        return sum;
    }
}