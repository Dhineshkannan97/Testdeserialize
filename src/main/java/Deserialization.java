import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String loc = "C:\\Users\\Dhinesh Kannan\\IdeaProjects\\Testdeserialize\\src\\main\\resources\\d.txt";
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(loc));
        TestSerial der = (TestSerial) in.readObject();
        System.out.println(der.age + ":" + der.name + ":" + der.id + ":" + der.salary);
        in.close();
    }
}
