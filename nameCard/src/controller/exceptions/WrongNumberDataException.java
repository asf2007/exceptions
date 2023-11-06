package controller.exceptions;

import java.io.IOException;

public class WrongNumberDataException extends IOException {
    public WrongNumberDataException() {
        super("Неверное количество данных");
    }
}
