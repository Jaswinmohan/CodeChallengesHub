class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str1=new StringBuilder();
        String str=s.toLowerCase();
        String[] arr=str.split(" ");
        for (int i=1;i<=str.length();i++){
            if(Character.isLetter(str.charAt(str.length()-i))||Character.isDigit(str.charAt(str.length()-i))){
                str1.append(str.charAt(str.length()-i));
            }
        }s=str1.toString();
        int r=s.length()-1;
        int l=0;
        while(r>l){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }r--;
            l++;
        }return true;
    }
}