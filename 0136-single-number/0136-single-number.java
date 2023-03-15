class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                int a = hm.get(nums[i]);
                hm.put(nums[i],a+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        
        Set<Integer> keys = hm.keySet();
        
        int ans = 0;
        
        for(int a : keys){
            if(hm.get(a)==1){
                ans = a;
            }
        }
        return ans;
    }
}