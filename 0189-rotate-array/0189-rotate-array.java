class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] ro=new int[n];
        for(int i=0;i<n;i++){
            ro[(i+k)%n]=nums[i];
        }for(int i=0;i<n;i++){
            nums[i]=ro[i];
        }
    }
}