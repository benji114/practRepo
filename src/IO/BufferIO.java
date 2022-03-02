package IO;

/*
BufferedInputStream
BufferedOutputStream
BufferedReader
BufferedWriter
 */

import java.io.*;

public class BufferIO {
    public static void main(String[] args) {

    }
    //copy jpg file
    public void bufferedStreamTest() throws IOException {
        File file = new File("xxxx.jpg");
        File desFile = new File("xxxx1.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(desFile);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        byte[] buffer = new byte[10];
        int len;
        while((len = bufferedInputStream.read(buffer))!= -1){
            bufferedOutputStream.write(buffer,0,len);
        }
        //先关外层再关内层
        bufferedInputStream.close();
        bufferedOutputStream.close();
        //关闭外层流的同时，内层流会自动进行关闭
        //fileInputStream.close();
        //fileOutputStream.close();
    }
}
