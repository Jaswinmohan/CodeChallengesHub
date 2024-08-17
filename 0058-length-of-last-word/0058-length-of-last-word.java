class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        for (int i=arr.length-1;i>=0;i--){
            if(!space(arr[i])){
                return arr[i].length();
            }
        }return 0;
    }

    public static Boolean space(String s){
        return s==null || s.trim().isEmpty();
    }
}