package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Checker {
    private List<String> wrongProps;
    private int wrongPropsCount;

    public Checker(List<String> wrongProps, int wrongPropsCount) {
        this.wrongProps = wrongProps;
        this.wrongPropsCount = wrongPropsCount;
    }

    public static Checker check(BufferedReader input, BufferedReader blackList) throws IOException {
        String[] propositions = input.readLine().split("[\\.\\!\\?]");
        String[] blackWords = blackList.readLine().split(" ");
        int wrongPropCount = 0;
        boolean containBlackWord = false;
        List<String> wrongProp = new ArrayList<>();

        for (String proposition : propositions) {
            String[] words = proposition.split(" ");
            for (String word : words) {
                containBlackWord = false;
                if (word.contains(",")) {
                    word.substring(0, word.indexOf(","));
                }
                for (String blackWord : blackWords) {
                    if (word.equalsIgnoreCase(blackWord)) {
                        containBlackWord = true;
                        wrongProp.add(proposition);
                        wrongPropCount++;
                        break;
                    }
                }
                if (containBlackWord) {
                    break;
                }
            }
        }
        return new Checker(wrongProp, wrongPropCount);
    }

    public List<String> getWrongProps() {
        return wrongProps;
    }

    public void setWrongProps(List<String> wrongProps) {
        this.wrongProps = wrongProps;
    }

    public int getWrongPropsCount() {
        return wrongPropsCount;
    }

    public void setWrongPropsCount(int wrongPropsCount) {
        this.wrongPropsCount = wrongPropsCount;
    }
}
