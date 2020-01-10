package ir.maktab.config;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.*;

public class MyApp {

    public static void main(String[] args) throws IOException {

        //command design pattern

        //when we suspect to module that can be change we should create interface and use the interface in high level module


        //
        //Logger logger = Logger.getLogger(MyApp.class.getName());
        //        try{
        //            int res = 10/0;
        //
        //        }catch (ArithmeticException e){
        //        }





        /*OutputStream out;
        DataOutputStream dataInputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\Reza\\Desktop\\test.bin"));

        dataInputStream.writeInt(10000);
        dataInputStream.writeInt(50000);
        dataInputStream.close();

        DataInputStream inputStream = new DataInputStream(new FileInputStream("C:\\Users\\Reza\\Desktop\\test.bin"));
        int num1=0;
        while (inputStream.available()>0){
            num1 += inputStream.readInt();
        }

        System.out.println(num1);
        inputStream.close();*/

       /* BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\Reza\\Desktop\\test.bin"),4);
        int bytes =bufferedInputStream.readAllBytes().length;
        System.out.println(bytes);
*/


    }// end of method main
}

