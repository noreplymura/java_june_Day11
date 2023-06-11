import java.io.*;
class FileDigit {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("D:\\Demo\\live.txt");
        BufferedReader br=new BufferedReader(fr);
        int i;

        int count=0;
        while ((i = br.read()) != -1) {
            //if (((char) i >= '0' && (char) i <= '9')) 
        count++;}
        System.out.println("The Digits is : "+count++);
        br.close();
        fr.close();
    }
}
