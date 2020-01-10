package ir.maktab.input;

import ir.maktab.InputAble;
import org.hibernate.sql.HSQLCaseFragment;

import java.util.Scanner;

public class ConsoleScannerInputableImple implements InputAble<Scanner,String> {
    @Override
    public String input(Scanner scanner) throws Exception {
        String string = scanner.nextLine();
        return string;
    }
}
