package homework;

import textFormater.TextFormater;

import java.io.*;

public class Homework1 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("Lesson 11/Resource/inPutFile.txt"));
        BufferedWriter output = new BufferedWriter(new FileWriter("Lesson 11/Resource/outPutFile.txt"));

        String text;
        while((text = input.readLine())!=null){
            if(TextFormater.palChecker(text)){
                output.write(text);
            }
        }

        input.close();
        output.close();
    }
}
