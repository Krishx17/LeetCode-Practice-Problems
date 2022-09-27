class minCostToMoveChips{
    public int minCostToMoveChips(int[] position) {
        int evenCounter = 0; 
        for(int chip : position)
            if(chip % 2 == 0)
                evenCounter++;
        
        int oddCounter = position.length - evenCounter;
            
        return (oddCounter > evenCounter) ? evenCounter : oddCounter;
    }
}