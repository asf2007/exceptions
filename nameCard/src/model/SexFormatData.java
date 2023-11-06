package model;

import controller.exceptions.WrongSexFormatException;

public class SexFormatData implements iFormatData{
    String data;

    public SexFormatData(String data) {
        this.data = data;
    }

    @Override
    public boolean isFormat() throws WrongSexFormatException {
        if(data.equals("m")||data.equals("f")){
            return true;
        }
        try {
            throw new WrongSexFormatException();
        }catch (WrongSexFormatException ex){
            System.out.println(ex);
            return false;
        }
    }
}
