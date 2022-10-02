class FindEvenNumberOfDigits{
    public int findNumbers(int[] nums) {
        int count = 0, totalEvenNumbers = 0;
        for(int i = 0; i < nums.length; i++){
            //algo to find the number of digits in a number
            int number = nums[i];
            while(number > 0){
                number = number / 10;
                count++;
            }
            if(count % 2 == 0){
                totalEvenNumbers++;
            }
            count = 0;
        }
        return totalEvenNumbers;
    }
}