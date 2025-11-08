import java.math.BigInteger;
class Solution {
    public int myAtoi(String s) {
        String str = "";
        boolean digitsStarted = false;
        boolean signSeen = false;
        
        for(char ch : s.toCharArray()){
            if(ch == ' ' && !digitsStarted && !signSeen){
                continue;
            }
            else if((ch == '-' || ch == '+') && !digitsStarted && !signSeen){
                str += ch;
                signSeen = true;
            }
            else if(Character.isDigit(ch)){
                str += ch;
                digitsStarted = true;
            }
            else{
                break;
            }
        }
        
        if(str.equals("-") || str.equals("+") || str.equals("")){
            return 0;
        }

        // long ans = Long.parseLong(str);
        BigInteger ans = new BigInteger(str);
        
        BigInteger max = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger min = BigInteger.valueOf(Integer.MIN_VALUE);

        if(ans.compareTo(max) > 0){     
            return Integer.MAX_VALUE;
        }
        else if(ans.compareTo(min) < 0){ 
            return Integer.MIN_VALUE;
        }

        return ans.intValue();
    }
}