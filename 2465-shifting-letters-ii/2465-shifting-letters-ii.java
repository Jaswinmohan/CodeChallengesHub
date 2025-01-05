class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int diff[] = new int[n+1];
        for(int[] arr:shifts){
            if(arr[2]==1){
                diff[arr[0]]++;
                diff[arr[1]+1]--;
            }else{
                diff[arr[0]]--;
                diff[arr[1]+1]++;
            }
        }for (int i=1;i<n;i++){
            diff[i]+=diff[i-1];
        }StringBuilder br=new StringBuilder();
        for(int i=0;i<n;i++){
            int count=diff[i]%26;
            if(count<0){
                count=count+26;
            }char va=(char)(((s.charAt(i)-'a'+count)%26)+'a');
            br.append(va);
        }return br.toString();
    }
}