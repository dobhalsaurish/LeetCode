import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k) return true;
            }
            map.put(nums[i],i);
        }
        return false;
        /*
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    if(Math.abs(i-j)<=k) return true;
                }
            }
        }
        return false;
        */
    }
}