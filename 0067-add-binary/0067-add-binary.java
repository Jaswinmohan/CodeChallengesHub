class Solution {
    public String addBinary(String a, String b) {
        StringBuilder br=new StringBuilder();
        int lena=a.length()-1;
        int lenb=b.length()-1;
        int carry=0;
        while(lena>=0 || lenb>=0 || carry==1){
            if(lena>=0){
                carry+=a.charAt(lena--)-'0';
            }if(lenb>=0){
                carry+=b.charAt(lenb--)-'0';
            }br.append(carry%2);
            carry/=2;
        }return br.reverse().toString();
    }
}