class Solution {
    public boolean isHappy(int n) {
        int sum=0,rem=0,i=0;
        while(i++<8){
            sum=0;
            rem=0;
            while(n!=0){
                rem=n%10;
                sum+=rem*rem;
                n/=10;
            }if(sum==1){
                return true;
            }System.out.print(sum+" ");
            n=sum;
            
        }return false;
    }
}