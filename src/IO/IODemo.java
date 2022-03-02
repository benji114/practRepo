package IO;

import java.io.*;

//surrounding with : alt + cmd + T

/**
 *
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
        testFileReaderFileWriter();
    }

//    public static void testFileReader(){
//            FileReader fileReader = null;
//        try {
//            File file = new File("/Users/benji/IdeaProjects/practRepo/src/IO/hello.txt");
//            //System.out.println(file.getAbsolutePath());
//            fileReader = new FileReader(file);
//            //fileReader.read();
//            //return single char, return -1 if reach end
////        int data = fileReader.read();
////        while(data != -1){
////            System.out.print((char) data);
////            data= fileReader.read();
////        }
//            int data;
//            while((data = fileReader.read()) != -1){
//                System.out.println((char) data);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try{
//                if(fileReader != null){
//                    fileReader.close();
//                }
//
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//
//        }
//    }

    public static void testFileReader1() throws IOException {
        File file = new File("/Users/benji/IdeaProjects/practRepo/src/IO/hello.txt");
        FileReader fileReader = new FileReader(file);
        char[] string = new char[5];
        int len;
        while((len = fileReader.read(string))!= -1){
            for (int i = 0; i < len; i++) {
                System.out.print(string[i]);
            }
        }
        fileReader.close();
    }

    public static void testFileWriter() throws IOException {
        File file = new File("/Users/benji/IdeaProjects/practRepo/src/IO/hello1.txt");
        //append true: add new content to existing content,false:override current content with new content
        FileWriter fileWriter = new FileWriter(file,false);

        fileWriter.write("i have a dream!\n");
        fileWriter.write("you need to have a dream");


        fileWriter.close();
    }

    public static void testFileReaderFileWriter() throws IOException {
        File file = new File("/Users/benji/IdeaProjects/practRepo/src/IO/hello.txt");
        File filewrite = new File("/Users/benji/IdeaProjects/practRepo/src/IO/hello1.txt");
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(filewrite);

        char[] string = new char[5];
        int len;
        while((len = fileReader.read(string))!= -1){
            for (int i = 0; i < len; i++) {
                fileWriter.write(string[i]);
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
