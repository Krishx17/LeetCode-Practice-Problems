// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {
//         //int variable to track the items in nums and index
//         int count = 0;
//         int lengthOfArray = nums.length;
//         int[] target = new int[nums.length];
//         //initialised array with zero values.
//         for(int i : target){
//             i = 0;
//         }
//         //to iterate through the array 
//         for(int i = 0; i < lengthOfArray; i++){
//             if(target[count-1] == 0){
//                 target[count-1] = nums[index[count++]];
//             }else{
//                 for(int j = lengthOfArray-1; j >= i; j--){
//                     target[j+1] = target[j];
//                 }
//                 target[i] = nums[index[count++]];    
//             }
//         }
//         return target;
//     }
// }



// class Solution {
// public int[] createTargetArray(int[] nums, int[] index) {
//      ArrayList<Integer> arr=new ArrayList<>();
//     int target[]=new int[nums.length];
//     for(int i=0;i<nums.length;i++){
//        arr.add(index[i],nums[i]);
//     }
//     for(int i=0;i<nums.length;i++){
//        target[i]=arr.get(i);
//     }
//     return target;
// }
//  }

import java.util.*;

class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int i=0;
        ArrayList<Integer> res=new ArrayList<Integer>();
        int[] ans=new int[nums.length];
        
        while(i<nums.length){
            res.add(index[i],nums[i]);
            i++;
        }
        for(int j=0;j<res.size();j++)  ans[j]=res.get(j);
        return ans;
    }
}