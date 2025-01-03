class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }long pref=0;
        int count=0;
        for(int i=0;i<nums.length-1;++i){
            pref=nums[i]+pref;
            if(pref>=sum-pref){
                count++;
            }
        }return count;
    }
}