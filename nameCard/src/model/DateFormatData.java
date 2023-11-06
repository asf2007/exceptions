package model;

public class DateFormatData implements iFormatData{
    String data;

    public DateFormatData(String data) {
        this.data = data;
    }

    @Override
    public boolean isFormat() {
        String [] dataArr = data.split("\\.");
        if(dataArr.length!=3) {
            System.out.println("Неверный формат. Необходимо ввести дату рождения - строка формата dd.mm.yyyy ");
            return false;
        }else{
            try{
            for (String str : dataArr
                 ) {
                    Integer.parseInt(str);
            }
            return true;
        }catch (NumberFormatException ex){
                System.out.println("Неверный формат. Необходимо ввести дату рождения - строка формата dd.mm.yyyy ");
                return false;
            }
            }

    }
}
