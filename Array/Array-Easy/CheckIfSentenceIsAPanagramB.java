import java.util.Set;
import java.util.HashSet;
class CheckIfSentenceIsAPanagramB {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(char c : sentence.toCharArray()){
            set.add(c);
        }
        return set.size() == 26;
    }
}