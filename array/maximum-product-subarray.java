class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int maxEnd=nums[0];
        int minEnd=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int tmp=maxEnd;
                maxEnd=minEnd;
                minEnd=tmp;
            }
            maxEnd=Math.max(maxEnd*nums[i],nums[i]);
            minEnd=Math.min(minEnd*nums[i],nums[i]);
            res=Math.max(maxEnd,res);
        }
        return res;
    }
}