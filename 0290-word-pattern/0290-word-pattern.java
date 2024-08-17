class Solution {
    public boolean wordPattern(String p, String s) {
        Map<Character,String> map=new HashMap<>();
        Map<String,Character> map1=new HashMap<>();
        String[] strarr=s.split(" ");
        if(p.length()!=strarr.length){
            return false;
        }
        for(int i=0;i<strarr.length;i++){
            char ch=p.charAt(i);
            if(map.containsKey(ch)){
                if(!(map.get(ch).equals(strarr[i]))){
                    return false;
                }
            }else{
                map.put(ch,strarr[i]);
            }if(map1.containsKey(strarr[i])){
                if(!(map1.get(strarr[i]).equals(ch))){
                    return false;
                }
            }else{
                map1.put(strarr[i],ch);
            }
        }return true;
    }
}