class Solution {
    public boolean isGood(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        if(arr.length < max+1) return false;

        for(int i=0; i<arr.length; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        if(mp.get(max) < 2 || mp.get(max) > 2) return false;
        else{
            for(int i=0; i<arr.length; i++){
                if(arr[i] != max && mp.get(arr[i]) >= 2) return false;
            }
        }

        return true; 
    }
}