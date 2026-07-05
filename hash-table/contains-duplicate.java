import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) return true;
            else set.add(num);
        }
        return false;
        /*
        int n= nums.length;
        int[] feq=new int[n+1];
        for(int num:nums){
            feq[num]++;
        }
        for(int i=0;i<n;i++){
            if(feq[i]>=2) return true;
        }
        return false;
        */
    }
}