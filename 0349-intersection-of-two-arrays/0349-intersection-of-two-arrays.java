class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> arr = new HashSet<>();

        for(int i = 0; i<nums2.length; i++){
            arr.add(nums2[i]);
        }

        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i = 0; i<nums1.length; i++){
            if(arr.contains(nums1[i])){
                arr2.add(nums1[i]);
                arr.remove(nums1[i]);
            }
        }

        int nums[] = new int[arr2.size()];

        for(int i = 0; i<nums.length; i++){
            nums[i] = arr2.get(i);
        }

        return nums;


    }
}