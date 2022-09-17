class RunningSumOf1DArray{
    public int maximumWealth(int[][] accounts) {
        
        // ArrayList<Integer> wealth = new ArrayList<>();
        int max = 0, sum = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(max < sum){
                max = sum;
            }
            sum = 0;
            // wealth.add(sum);
        }
    //     max = wealth.get(0);
    //     for(int k = 1; k < wealth.size(); k++){
    //         if(max < wealth.get(k)){
    //             max = wealth.get(k);
    //         }
    //     }
    //     return max;
        return max;
    }
        
}