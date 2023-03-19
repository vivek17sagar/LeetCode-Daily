class Solution {
    public int removeDuplicates(int[] nums) {

      
        for(int i = 0; i<nums.length-1; i++){
            int k = nums[i];
            for(int j = i+1; j<nums.length; j++){
                if(k == nums[j]){
                    nums[j] = -200;
                }
            }
        }
        
        
        int count = 0;
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>=-100){
                nums[j] = nums[i];
                count++;
                j++;
            }
        }
        

        return count;
}
}