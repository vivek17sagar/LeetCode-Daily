class Solution {
    public int missingNumber(int[] nums) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i =0; i<nums.length; i++){
            arr.add(nums[i]);
        }
        
        for(int i = 1;i<=nums.length; i++){
            if(!arr.contains(i)){
                return i;
            }
        }
        
        return 0;
    }
}