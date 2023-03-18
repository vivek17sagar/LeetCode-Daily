class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int n = capacity;

        for(int i = 0; i<plants.length; i++){
            if(plants[i]<=n){
                steps += 1;
                n -= plants[i];
            }
            else{
                steps += i;
                steps += (i+1);
                // n = plants[i];
                n = capacity;
                n -= plants[i];
            }   
        }

        return steps;
    }
}