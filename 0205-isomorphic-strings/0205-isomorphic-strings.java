class Solution {
    public boolean isIsomorphic(String r, String m) {
        Map<Character,Character> map=new LinkedHashMap<>();
        Map<Character,Character> map1=new LinkedHashMap<>();
        for(int i=0;i<r.length();i++){
            char rch=r.charAt(i);
            char mch=m.charAt(i);
            if(map.containsKey(rch)){
                if(map.get(rch)!=mch){
                    return false;
                }
            }else{
                map.put(rch,mch);
            }if(map1.containsKey(mch)){
                if(map1.get(mch)!=rch){
                    return false;
                }
            }else{
                map1.put(mch,rch);
            }
        }
        return true;
    }
}