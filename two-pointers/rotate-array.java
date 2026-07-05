class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        if(n==0) return;
        k=k%n;
        int i,j;
        for(i=n-k,j=n-1;i<j;i++,j--){
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
        for(i=0,j=n-k-1;i<j;i++,j--){
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
        for(i=0,j=n-1;i<j;i++,j--){
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    }
}