package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework3 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("Lesson 11/Resource/initText.txt"));
        BufferedReader blackList = new BufferedReader(new FileReader("Lesson 11/Resource/blackList.txt"));
        Checker checker = Checker.check(input, blackList);

        if (checker.getWrongPropsCount() != 0) {
            System.out.println("Текст не прошёл проверку");
            System.out.println("Количество предложений не прошедших проверку = " + checker.getWrongPropsCount());
            for (String proposition : checker.getWrongProps()) {
                System.out.println(proposition);
            }
        } else {
            System.out.println("Текст прошёл проверку");
        }
    }
}
