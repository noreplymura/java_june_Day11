import java.io.*;

public class BufferedReaderFile {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("D:\\Demo\\live.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
