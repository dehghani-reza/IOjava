package ir.maktab;

import ir.maktab.config.export.ExportToConsole;
import ir.maktab.input.ConsoleScannerInputableImple;
import ir.maktab.process.ProcessImpleProcessAble;

import java.util.Scanner;

public class YourApp {
    public static void main(String[] args) throws Exception {
        //input data
        //processing data(+/-)
        //export to variable format

        InputAble inputAble = new ConsoleScannerInputableImple();
        ProcessAble processAble = new ProcessImpleProcessAble();
        ExportAble exportAble = new ExportToConsole();
         HighLevel highLevel = new HighLevel(inputAble,processAble,exportAble);
         highLevel.run();
    }
}
