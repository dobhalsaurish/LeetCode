class Solution {
    public void moveZeroes(int[] nums) {
        /*
        int n=nums.length;
        if(n==0) return;
        int count=0;
        Arrays.sort(nums);
        int i,j;
        for(i=0,j=n-1;i<j;i++,j--){
            if(nums[i]==0){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                count++;
            }
        }
        for(i=0,j=n-count-1;i<j;i++,j--){
            int tmp=nums[i];
            nums[i]=nums[j];
            nums[j]=tmp;
        }
        */
        int n=nums.length;
        int i=0,j=i+1;
        while(i<n && j<n){
            if(nums[i]==0 && nums[j]!=0){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }
            else{
                i++;
                if(j<=i) j=i+1;
            }
        }
    }
}