class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int rotation =0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                rotation++;
            }
        }
        if(nums[0]<nums[n-1]){
            rotation++;
        }
        return rotation <=1;
    }
}