import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class TextFormater {
    public static int wordsCounter(String text){
        String[] words = text.split(" ");
        return words.length;
    }

    public static boolean palChecker(String text){
        boolean flag = false;
        String[] words = text.split(" ");
        for(String word:words){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==word.charAt(word.length()-1-i)){
                    flag=true;
                } else {
                    return false;
                }
            }
        }
        return flag;
    }
}
