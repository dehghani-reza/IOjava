package ir.maktab.input;

import java.io.*;

public class DataInputtreamIOImple extends InputWithFileIOImpl {
    @Override
    public DataInputStream input(File file) throws FileNotFoundException {
        DataInputStream dataInputStream =new DataInputStream(new FileInputStream(file));
        return dataInputStream;
    }
}
