class ConcatenationOfArray{
    public int[] getConcatenation(int[] nums) {
        int lengthOfArray = nums.length;
        int[] ans = new int[2*lengthOfArray];
        
        //count variable to keep count of traversing in nums
        int count = 0;
        for(int i = 0; i < ans.length; i++){
            if(count >= nums.length)
                count = 0;
            ans[i] = nums[count++];
        }
        return ans;
    }
}