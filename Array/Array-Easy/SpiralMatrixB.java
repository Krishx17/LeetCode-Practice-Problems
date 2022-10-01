import java.util.*;
class SpiralMatrixB {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(generateMatrix(3)));
        // for(int[] i: generateMatrix(3)){
        //     System.out.print(i+" ");
        // }
        // for(int i = 0; i < resArray.length; i++){
            
        // }
    }
    public static int[][] generateMatrix(int n) {
        int[][] resArray = new int[n][n];

        List<Integer> numbs = new ArrayList<>();
        for(int i = 1; i <= n*n; i++){
            numbs.add(i);
        }

        //declaring all the variable that we'll need to continue with the program
         
        int row = n, rowStart = 0, rowEnd = row - 1;
        int col = n, colStart = 0, colEnd = col - 1;
        //count variable is to calculate number of iterations 
        int count = 0, total = n * n; //total number of iterations
        //to track the columns
        int colmn = 0, num = 0;

        //generating first row 
        for(int i = colStart; count < total && i <= colEnd; i++){
            resArray[i][colmn++] = numbs.get(num++);
            count++;
        }
        rowStart++;

        //generating the last column 
        for(int i = rowStart;count<total && i<=rowEnd;i++){
            resArray[i][colmn++] = numbs.get(num++);
            count++;
        }

        //
        return resArray;
    }
}







        
//         List<Integer> numbs = new ArrayList<>();
//         for(int i = 1; i < n*n; i++){
//             numbs.add(i);
//         }
//         // Answer list
//         List<Integer> ans = new ArrayList<Integer>();  
// //         Size of row and column of the 2d array matrix
//         int row = n;
//         int col = n;
        
// //         Total no. of iterations
//         int total = row*col;
        
//         int rowStart = 0;
//         int rowEnd = row-1;
//         int colStart = 0;
//         int colEnd = col-1;
        
// //         Counter for calculating no. of iterations 
//         int count = 0;
        
//         while(count<total){
// //             Printing the first row
//             for(int i = colStart;count<total && i<=colEnd;i++){
//                 ans.add(numbs.get(i));
//                 count++;
//             }
//             rowStart++;
// //             Printing the last col
//             for(int i = rowStart;count<total && i<=rowEnd;i++){
//                 ans.add(numbs.get(i));
//                 count++;
//             }
//             colEnd--;
// //             Printing the last row
//             for(int i = colEnd;count<total && i>=colStart;i--){
//                 ans.add(numbs.get(i));
//                 count++;
//             }
//             rowEnd--;
// //              Printing the first col
//             for(int i = rowEnd;count<total && i>=rowStart;i--){
//                 ans.add(numbs.get(i));
//                 count++;
//             }
//             colStart++;
//         }
// //         Returning answer list
//         return ans;




        // System.out.println(numbs);
        // int[][] k = {{1,2,3}};
        
        //  return k;