package ir.maktab;

import java.util.Scanner;

public class HighLevel {

    InputAble inputAble;
    ProcessAble processAble;
    ExportAble exportAble;
    Scanner scanner = new Scanner(System.in);

    public HighLevel(InputAble inputAble, ProcessAble processAble, ExportAble exportAble) {
        this.inputAble = inputAble;
        this.processAble = processAble;
        this.exportAble = exportAble;
    }
    void run() throws Exception {
        exportAble.export(processAble.dataProcessing(inputAble.input(scanner)));
    }
}
