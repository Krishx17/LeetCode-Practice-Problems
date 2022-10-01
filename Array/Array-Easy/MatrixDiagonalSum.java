/**
 * NameOfTheQuestion : MatrixDiagonalSum 
 * Link : https://leetcode.com/problems/matrix-diagonal-sum/
 * Platform : LeetCode 
 * Topic : Array-2D (Easy)
 * AuthorOfTheSolution : @Rudy45KC 
 */

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int r = mat.length;
        for(int i = 0; i < r; i++){
            sum = mat[i][i]  + sum;
            sum = sum + mat[i][r - i -1];
        }
        if(r % 2 == 1){
            sum = sum - mat[r/2][r/2];
        }
        return sum;
    }
}


// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int rowStart = 0,  colStart = 0;
//         int lengthOfArray = mat.length; // length of the 2D array
//         int colEnd = lengthOfArray - 1;
//         int diagonalSum = 0;
        
//         //to sum up the primary diagonal 
//         for(int i = 0; i < lengthOfArray; i++){
//             diagonalSum += mat[rowStart++][colStart++];
//         }
        
//         rowStart = 0;
//         colStart = 0;
        
//         //changing the intersection order pair of diagonals to zero 
//         if(lengthOfArray % 2 != 0){
//             mat[lengthOfArray/2][lengthOfArray/2] = 0;
//         }
        
//         //to sum up the secondary diagonal
//         for(int i = 0; i < lengthOfArray; i++){
//             diagonalSum += mat[rowStart++][colEnd--];
//         }
//         return diagonalSum;
//     }
// }