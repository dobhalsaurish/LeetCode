class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0, right=n-1;
        int pos=n-1;
        int[] arr=new int[n];
        /*
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
        */
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                arr[pos]=nums[left]*nums[left];
                left++;
            }else{
                arr[pos]=nums[right]*nums[right];
                right--;
            }
            pos--;
        }
        return arr;
    }
}