class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> arr=new HashMap<>();
        for(int ar:nums){
            arr.put(ar,arr.getOrDefault(ar,0)+1);
        }for(Map.Entry<Integer,Integer> entry:arr.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }return 0;
    }
}