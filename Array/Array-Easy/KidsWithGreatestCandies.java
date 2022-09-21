import java.util.*;
class KidsWithGreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int a : candies)
            max = Math.max(a, max);
        
        List<Boolean> res = new ArrayList<>();
        
        for(int i=0;i<candies.length;i++)
           res.add((candies[i]+extraCandies>=max) ? true : false);
        
        return res;
    }
}

