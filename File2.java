import java.io.CharArrayWriter;
import java.io.FileWriter;
public class File2 {
    public static void main(String args[]) throws Exception {
        CharArrayWriter out = new CharArrayWriter();
        out.write("Wellcom to the Training");
        FileWriter f1 = new FileWriter("D:\\Demo\\a.txt");
        FileWriter f2 = new FileWriter("D:\\Demo\\b.txt");
        FileWriter f3 = new FileWriter("D:\\Demo\\c.txt");
        FileWriter f4 = new FileWriter("D:\\Demo\\d.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        f1.close();f2.close();f3.close(); f4.close();
        System.out.println("Success.....,");
    }
}
