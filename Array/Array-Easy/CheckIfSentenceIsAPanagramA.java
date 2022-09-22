import java.util.ArrayList;
class CheckIfSentenceIsAPanagramA {
    public boolean checkIfPangram(String sentence) {
        int count = 0;
        ArrayList<Character> alphabet = new ArrayList<>();
        for(int i = 0; i < sentence.length(); i++){
            if(alphabet.contains(sentence.charAt(i))){
                continue;
            }else{
                alphabet.add(sentence.charAt(i));
                count++;
            }
        }
        if(count == 26){
            return true;
        }
        return false;
    }
}
