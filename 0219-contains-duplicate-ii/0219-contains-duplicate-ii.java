class Solution {
    public boolean containsNearbyDuplicate(int[] n, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n.length;i++){
            int num=n[i];
            if(map.containsKey(num)){
                if(i-map.get(num)<=k){
                    return true;
                }else{
                    map.put(num,i);
                }
            }else{
                map.put(num,i);
            }
        }return false;
    }
}