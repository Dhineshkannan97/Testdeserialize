import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Deserialization {
    private static final long serialVersionUID = 1L;
    int age;
    int id;
    String name;
    String salary;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String loc = "C:\\Users\\Dhinesh Kannan\\Downloads\\d.txt";
        ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Path.of(loc)));
        byte[] bytes = in.readAllBytes();
        bytes.getClass();
        System.out.println(bytes.toString());
//       Deserialization ser = (Deserialization) in.readAllBytes();
//        System.out.println(ser.age + ser.id + ser.name + ser.salary);
        in.close();
    }
}
