class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        boolean val=true;
        for(int i=0;i<n;i++){
            if(bits[i]==1){
                val=false;
                i++;
            }else{
                val=true;
            }
        }return val;
    }
}