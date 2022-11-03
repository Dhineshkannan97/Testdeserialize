import java.io.*;

public class Deserialization implements Serializable {
    private static final long serialVersionUID = -9223365651070458532L;
    int age;
    String name;
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String loc = "C:\\Users\\Dhinesh Kannan\\Downloads\\d.txt";
        FileInputStream fileInputStream = new FileInputStream(loc); //new FileInputStream(loc)
          BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
          ObjectInputStream in = new ObjectInputStream(bufferedInputStream);
//        byte[] bytes = in.readAllBytes();
//        bytes.getClass();
//        System.out.println(bytes.toString());
       Deserialization der= (Deserialization) in.readObject();
        System.out.println(der.age+der.name);
        in.close();
    }
}
