class Solution {
    public int majorityElement(int[] nums) {
        //HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int count=0;
        int candidate=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
                count=1;
            }
            else if(candidate==num) count++;
            else count--;
        }
        return candidate;
        /*count=0;
        for(int num:nums){
            if(candidate==num) count++;
        }

        if(count>n/2){
            return candidate;
        }
        return -1;*/
    }
}