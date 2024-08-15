class Solution {
    public int pivotIndex(int[] nums) {
        int l=0;
        int r=0;
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                l+=nums[j];
            }for(int j=i+1;j<nums.length;j++){
                r+=nums[j];
            }System.out.println(l+" "+r);
            if(l==r){
                return i;
            }l=0;r=0;
        }return -1;
    }
}