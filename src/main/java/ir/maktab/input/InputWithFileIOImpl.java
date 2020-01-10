package ir.maktab.input;

import ir.maktab.InputAble;

import java.io.*;

public class InputWithFileIOImpl implements InputAble<File,InputStream> {
    @Override
    public InputStream input(File file) throws FileNotFoundException {
        InputStream InputStream = new FileInputStream(file);
        return InputStream;
    }

}
