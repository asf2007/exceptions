package model;

import controller.exceptions.WrongSexFormatException;

public interface iFormatData {
    public boolean isFormat() throws WrongSexFormatException;
}
