import java.util.List;
class CountItemMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int ans=0;int index=0;
        if(ruleKey.equals("color")) 
        { index=1;}
        else if(ruleKey.equals("name")) 
            index=2;
        for(List i: items)
        {
            if(i.get(index).equals(ruleValue))
                ans++;
        }
        return ans;
    }
}