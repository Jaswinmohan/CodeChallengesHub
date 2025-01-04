class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> letter=new HashSet();
        for(Character cr:s.toCharArray()){
            letter.add(cr);
        }int ans=0;
        for(Character cr:letter){
            int i=-1;
            int j=0;
            for(int k=0;k<s.length();k++){
                if(s.charAt(k) == cr){
                    if(i==-1){
                        i=k;
                    }
                    j=k;
                }
            }Set<Character> between= new HashSet();
            for(int k=i+1;k<j;k++){
                between.add(s.charAt(k));
            }ans+=between.size();
        }return ans;
    }
}