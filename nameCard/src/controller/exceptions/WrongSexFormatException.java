package controller.exceptions;

import java.io.IOException;

public class WrongSexFormatException extends IOException {
    public WrongSexFormatException() {
        super("Неверный формат. Необходимо ввести пол - символ латиницей f или m");
    }
}
