package homework;

import textFormater.TextFormater;

import java.io.*;

public class Homework2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("Lesson 11/Resource/inPutText.txt"));
        BufferedWriter output = new BufferedWriter(new FileWriter("Lesson 11/Resource/outPutText.txt"));

        String[] strings = input.readLine().split("[\\.\\!\\?]");
        for (String string : strings) {
            if (TextFormater.wordsCounter(string) >= 3 && TextFormater.wordsCounter(string) <= 5 || TextFormater.palChecker(string)) {
                output.write(string+"\n");
            }
        }

        input.close();
        output.close();
    }
}
