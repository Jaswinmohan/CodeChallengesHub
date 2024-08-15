class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }int count=0;
        int i=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            nums[i]=entry.getKey();
            count++;i++;
        }return count;
    }
}