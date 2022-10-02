import java.util.*;
class SpiralMatrixA{
    public List<Integer> spiralOrder(int[][] matrix) {
//         Answer list
        List<Integer> ans = new ArrayList<Integer>();  
//         Size of row and column of the 2d array matrix
        int row = matrix.length;
        int col = matrix[0].length;
        
//         Total no. of iterations
        int total = row*col;
        
        int rowStart = 0;
        int rowEnd = row-1;
        int colStart = 0;
        int colEnd = col-1;
        
//         Counter for calculating no. of iterations 
        int count = 0;
        
        while(count<total){
//             Printing the first row
            for(int i = colStart;count<total && i<=colEnd;i++){
                ans.add(matrix[rowStart][i]);
                count++;
            }
            rowStart++;
//             Printing the last col
            for(int i = rowStart;count<total && i<=rowEnd;i++){
                ans.add(matrix[i][colEnd]);
                count++;
            }
            colEnd--;
//             Printing the last row
            for(int i = colEnd;count<total && i>=colStart;i--){
                ans.add(matrix[rowEnd][i]);
                count++;
            }
            rowEnd--;
//              Printing the first col
            for(int i = rowEnd;count<total && i>=rowStart;i--){
                ans.add(matrix[i][colStart]);
                count++;
            }
            colStart++;
            
        }
//         Returning answer list
        return ans;
    }
}