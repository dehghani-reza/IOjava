package ir.maktab.config.export;

import ir.maktab.ExportAble;

public class ExportToConsole implements ExportAble<Integer> {
    @Override
    public void export(Integer s) {
        System.out.println(s);
    }
}
