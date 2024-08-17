class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<String> arr1=new ArrayList<>();
        if(nums==null || nums.length == 0){
            return new ArrayList<>();
        }else if(nums.length==1){
            arr1.add(String.valueOf(nums[0]));
            return arr1;
        }
        arr.add(nums[0]);
        StringBuilder br=new StringBuilder();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==(nums[i-1]+1)){
                arr.add(nums[i]);
                if(i!=nums.length-1){
                    continue;
                }
            }
            if(arr.get(0)!=arr.get(arr.size()-1)){
                br.append(arr.get(0));
                br.append("->");
                br.append(arr.get(arr.size()-1));
            }else{
                br.append(arr.get(0));
            }arr1.add(br.toString());
            arr.clear();
            br.setLength(0);
            arr.add(nums[i]);
            if(i==nums.length-1 && arr.get(0)==arr.get(arr.size()-1) && nums[i]!=(nums[i-1]+1)){
                br.append(arr.get(0));
                arr1.add(br.toString());
            }
        }return arr1;
    }
}