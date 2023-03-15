class Solution {
    public int majorityElement(int[] nums) {
        
        // double h = nums.length/2;
        // int need = (int)Math.ceil(h);
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                int a = hm.get(nums[i]);
                hm.put(nums[i],a+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        
        Set<Integer> key = hm.keySet();
        
        int count = 0;
        int ans = 0;
        
        for(int element: key){
            if(hm.get(element)>count){
                count = hm.get(element);
                ans = element;
            }
        }
        
        return ans;
    }
}