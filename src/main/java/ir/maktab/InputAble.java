package ir.maktab;

import java.io.FileNotFoundException;

public interface InputAble<T , U> {

    U input(T t) throws Exception;
}
