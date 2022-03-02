package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOStreamDemo {
    public static void main(String[] args) throws IOException {
        testFileInputStream();
    }

    public static void testFileInputStream() throws IOException {
        File file = new File("/Users/benji/IdeaProjects/practRepo/src/IO/hello.txt");
        FileInputStream inputStream = new FileInputStream(file);

        byte[] buff = new byte[5];
        int len;
        while((len = inputStream.read(buff))!= -1){
            String str = new String(buff,0,len);
            System.out.print(str);
        }

        inputStream.close();
    }
}
