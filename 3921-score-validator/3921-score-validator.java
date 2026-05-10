class Solution {
    public int[] scoreValidator(String[] events) {
        int total_score = 0;
        int counter = 0;

        for(int i=0; i < events.length; i++){
            if(events[i].equals("W")){
                counter++;
                if(counter >= 10) break;
            }

            else{
                if(events[i].equals("WD") || events[i].equals("NB") ){
                    total_score++;
                }
                else if(events[i].length() == 1 && events[i] != "W"){
                    total_score += Integer.parseInt(events[i]);
                }
            }
        }
        return new int [] {total_score,counter};
    }
}