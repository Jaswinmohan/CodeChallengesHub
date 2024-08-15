class Solution {
    public boolean hasAlternatingBits(int n) {
        int[] arr=new int[100];
        int i=0;
        while(n>0){
            arr[i]=n%2;
            n/=2;
            i++;
        }int[] arr1=new int[i];
        for (int j=0;j<i;j++){
            arr1[j]=arr[j];
        }
        System.out.print(Arrays.toString(arr1));
        for(int k=0;k<i-1;k++){
            if((arr1[k]==0 && arr1[k+1]==0) || (arr1[k]==1 && arr1[k+1]==1)){
                return false;
            }
        }
        return true;
    }
}