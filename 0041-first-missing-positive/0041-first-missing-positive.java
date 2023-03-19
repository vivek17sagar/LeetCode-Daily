class Solution {
    public int firstMissingPositive(int[] nums) {
        
        long max = 0;
        HashSet<Integer> arr = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++){
            arr.add(nums[i]);
            if(nums[i]>max){
                max=nums[i];
            }
        }
        
        for(int i = 1; i<=max+1; i++){
            if(!arr.contains(i)){
                return i;
            }
        }
        
        return -1;
    }
}