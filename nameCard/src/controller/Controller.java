package controller;

import controller.exceptions.WrongNumberDataException;
import controller.exceptions.WrongSexFormatException;
import model.DateFormatData;
import model.FileModel;
import model.PhoneNumData;
import model.SexFormatData;
import view.ViewNameCard;

public class Controller {
private ViewNameCard view;
private FileModel model;

    public Controller(ViewNameCard view, FileModel model) {
        this.view = view;
        this.model = model;
    }
    public void start() throws WrongNumberDataException {
        while (true) {
            String data = view.inputData();
            String [] arrData = data.split(" ");
            if (arrData[0].equals("stop")){
                break;
            }
            if (arrData.length != 6) {
                try {
                    throw new WrongNumberDataException();
                } catch (WrongNumberDataException ex) {
                    ex.printStackTrace();
                }
            } else {
                try {
                    if ((new DateFormatData(arrData[3]).isFormat())&&
                            (new PhoneNumData(arrData[4]).isFormat())&&
                            (new SexFormatData(arrData[5]).isFormat())) {
                        model.writeData(arrData);
                    }
                } catch (WrongSexFormatException e) {
                }

            }
            }
        }

    }

