class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int dest=n-1;
        if(nums[0]>=nums.length-1){
            return true;
        }for(int i=n-2;i>=0;i--){
            if(nums[i]+i>=dest){
                dest=i;
            }if(dest==0){
                return true;
            }
        }return false;
    }
}