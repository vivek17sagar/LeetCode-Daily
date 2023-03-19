class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int ans = nums.length;
        ArrayList<Integer> hm = new ArrayList<>();
        
        for(int i = 0; i<nums.length; i++){
            hm.add(nums[i]);
        }
        
        if(hm.contains(target)){
            ans = hm.indexOf(target);
        }
        else{
           for(int i = target; i<10000; i++){ 
            if(hm.contains(i)){
               ans = hm.indexOf(i);
                break;   
                }
            }
        }
        return ans;
    }
}