class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int in:nums){
            map.put(in,map.getOrDefault(in,0)+1);
        }int j=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                for(int i=0;i<2;i++){
                    nums[j++]=entry.getKey();
                }
            }else{
                nums[j++]=entry.getKey();
            }
        }return j;
    }
}