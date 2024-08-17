class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0,l=0;
        while(k<s.length()){
            if(k>s.length()-1){
                return true;
            }else if(l>t.length()-1){
                return false;
            }if(s.charAt(k)==t.charAt(l)){
                k++;
                l++;
            }else if(s.charAt(k)!=t.charAt(l)){
                l++;
            }
        }return true;
    }
}