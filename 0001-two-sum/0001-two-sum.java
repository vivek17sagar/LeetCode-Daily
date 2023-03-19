class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        ArrayList<Integer> arr = new ArrayList<>();
        int ans[] = new int[2];
        
        
        for(int i = 0; i<nums.length; i++){
            int need = target-nums[i];
            
            if(arr.contains(need)){
                ans[0] = arr.indexOf(need);
                ans[1] = i;
            }else{
                arr.add(nums[i]);
            }
        }
        return ans;
    }
}