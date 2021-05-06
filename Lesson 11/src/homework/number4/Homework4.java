package homework.number4;

import java.io.*;

public class Homework4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Auto auto = new Auto("Nissan", 20000, 200);
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("Lesson 11/Resource/car.data"));
        stream.writeObject(auto);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Lesson 11/Resource/car.data"));
        System.out.println(inputStream.readObject());
    }
}
