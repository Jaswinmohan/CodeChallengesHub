class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
		int count=0;
		for (int i=0;i<len;i++) {
			if (nums[i]==val) {
				nums[i]=-1;
				count+=1;
			}
		}int i=0;
		int flag=0;
		while(i<len-count) {
			if(nums[i]==-1) {
				flag=1;
				for(int j=i;j<len-1;j++) {
					nums[j]=nums[j+1];
				}nums[len-1]=-1;
			}if(flag==0) {
				i++;
			}flag=0;
		}return len-count;
    }
}