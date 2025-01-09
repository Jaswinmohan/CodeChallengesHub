class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String str:words){
            if(str.length()>=pref.length()){
                count++;
                a:for(int i=0;i<pref.length();i++){
                    if(pref.charAt(i)!=str.charAt(i)){
                        count--;
                        break a;
                    }
                }
            }
        }return count;
    }
}