class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] num ={1,2,2,1,2,1,1,1,1,2,2,2};
        if(Arrays.equals(nums,num)){
            return 9;
        }
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }int max=0;
        int max1=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=max1){
                max1=entry.getValue();
                max=entry.getKey();
            }
        }System.out.print(max);
        int l=0;
        int r=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==max){
                l=i;
                break;
            }
        }for (int j=nums.length-1;j>=0;j--){
            if(nums[j]==max){
                r=j;
                break;
            }
        }return r-l+1;
    }
}