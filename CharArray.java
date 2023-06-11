import java.io.CharArrayReader;
class CharArray {
    public static void main(String[] args) throws Exception{
        char[] ary = { 'A', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
        CharArrayReader reader = new CharArrayReader(ary);
        int k = 0;
        while ((k = reader.read()) != -1) {
            char ch = (char) k;
            System.out.print(ch + ":");
            System.out.println(k);
        }
    }
}
