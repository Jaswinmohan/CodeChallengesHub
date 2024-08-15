class Solution {
    public int countBinarySubstrings(String s) {
        int cur=1,prv=0,sum=0;
        for (int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cur++;
            }else{
                sum+=Math.min(cur,prv);
                System.out.println(Math.min(cur,prv));
                prv=cur;
                cur=1;
            }
        }return sum+Math.min(cur,prv);
    }
}