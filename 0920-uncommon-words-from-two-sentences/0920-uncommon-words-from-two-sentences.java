class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String[] strarr1=s1.split("\\s+");
        String[] strarr2=s2.split("\\s+");
        ArrayList<String> arr=new ArrayList<>();
        for(String str:strarr1){
            map.put(str,map.getOrDefault(str,0)+1);
        }for(String str:strarr2){
            map.put(str,map.getOrDefault(str,0)+1);
        }for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()<2){
                arr.add(entry.getKey());
            }
        }String[] str=arr.toArray(new String[0]);
        return str;
    }
}