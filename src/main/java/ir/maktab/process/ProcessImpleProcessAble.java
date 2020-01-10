package ir.maktab.process;

import ir.maktab.InputAble;
import ir.maktab.ProcessAble;

public class ProcessImpleProcessAble implements ProcessAble<String,Number> {
    @Override
    public Number dataProcessing(String string) {
        int number = Integer.parseInt(string);
        number*=2;
        return number;
    }
}
