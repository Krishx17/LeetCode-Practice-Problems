//optimized solution
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i])
                nums[count++]=nums[i];
        }
    return count;
    }
}


//Earlier solution 
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         //to iterate through the array
//         int i, j,current = nums[0], count = 0;
//         int lengthOfArray = nums.length;
//         for(i = 0; i < lengthOfArray; i=j){
//             nums[count++] = nums[i];
//             for(j = i+1; j < lengthOfArray; j++){
//                 if(nums[i] == nums[j]){
//                     continue;
//                 }
//                 break;
//             }
//         }
//         return count;
//     }
// }