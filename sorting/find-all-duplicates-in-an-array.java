import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int[] freq=new int[n+1];
        for(int num:nums){
            freq[num]++;
        }
        for(int i=0;i<=n;i++){
            if(freq[i]>=2){
                ans.add(i);
            }
        }
        return ans;
    }
}