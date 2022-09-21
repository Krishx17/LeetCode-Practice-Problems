import java.util.*;
class KidsWithGreatestCandies2 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        List<Boolean> arrList=new ArrayList<>();
        for(int i:candies) max=Math.max(i,max);
        for(int i:candies) arrList.add(i+extraCandies>=max);
        return arrList;
        
    }
}