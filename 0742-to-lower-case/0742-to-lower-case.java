class Solution {
    public String toLowerCase(String s) {
        StringBuilder br=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>64 && s.charAt(i)<91){
                br.append((char)(s.charAt(i)+32));
            }else{
                br.append(s.charAt(i));
            }
        }return br.toString();
    }
}