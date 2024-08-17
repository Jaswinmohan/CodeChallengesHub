class Solution {
    public boolean canConstruct(String r, String m) {
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map1=new HashMap<>();
        for(char ch:r.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }for(char ch:m.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }int i=0,j=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            for(Map.Entry<Character,Integer> entry1:map1.entrySet()){
                if(entry.getValue()<=entry1.getValue() && entry.getKey()==entry1.getKey()){
                    i++;
                }
            }if(i==map.size()){
                return true;
            }
        }
        return false;
    }
}