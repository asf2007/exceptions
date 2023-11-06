package model;

import java.util.IllegalFormatException;

public class PhoneNumData implements iFormatData{
    String data;

    public PhoneNumData(String data) {
        this.data = data;
    }

    @Override
    public boolean isFormat() {
        try {
            Long.parseLong(data);
            return true;
        } catch(NumberFormatException ex){
            System.out.println("неверный формат номера телефона: необходимо ввести целое беззнаковое число без форматирования");
            return false;
        }


    }
}
