class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int lengthOfArray = nums.length;
        int[] ans = new int[lengthOfArray];
        
        //for loop to iterate over the given array 
        for(int i = 0; i < lengthOfArray;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}